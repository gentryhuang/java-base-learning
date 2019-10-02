package com.design.pattern.singleton.lazysafedoublecheck;

/**
 * LazyDoubleCheckSingleton 双重检锁
 *
 * @author shunhua
 * @date 2019-10-03
 */
public class LazyDoubleCheckSingleton {

    /**
     * 定义LazySingleton属性 ,这里加volatile关键字防止指令重排序和内存可见
     */
    private volatile static LazyDoubleCheckSingleton lazySingleton = null;

    /**
     * 指定构造方法是私有的
     */
    private LazyDoubleCheckSingleton(){}

    /**
     * 全局控制点
     *
     *
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance(){
        /**
         *  1 这一层if判断如果不使用也能保证线程安全，但是锁的粒度又回到了大粒度版本。使用这一层判断是为了缩小synchronized锁的粒度
         *  2 引入了这一层会增加一个隐患-由于指令重排序，走到该层if判断lazySingleton可能确实不为空，但是它指向的对象可能还没有初始化完成，当使用这个对象的时候会导致系统异常
         */
        if(lazySingleton == null){
            /**
             * 加锁
             */
            synchronized (LazyDoubleCheckSingleton.class){
                /**
                 * 这一层if必须要有，因为synchronized锁的粒度小了，不是整个方法，当出现线程进入第一个if块中但被阻塞在同步代码块外时（别的线程拿到了锁在里面创建对象），
                 * 如果不加该if判断该线程还会创建一个对象，而不会直接返回已经创建好的对象的引用。
                 */
                if(lazySingleton == null){
                    /** LazyDoubleCheckSingleton = new LazyDoubleCheckSingleton() 主要步骤：
                     *
                     * 1. 分配内存给这个对象
                     * 2. 初始化对象
                     * 3. 设置lazySingleton指向分配好的内存地址
                     * 注意：在没有处理指令重排序的情况下2、3两步由于重排序可能步骤会倒置，这会可能会造成线程拿到的引用指向的是一个还没有初始化完成的对象，当使用这个对象的时候会导致系统异常
                    */
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }

        }
        return lazySingleton;
    }

}