package com.design.pattern.singleton.lazysafebutlockisbig;

/**
 * LazyDoubleCheckSingleton 懒汉式-线程安全但是锁的粒度太大
 *
 * @author shunhua
 * @date 2019-10-02
 */
public class LazySingleton {
    /**
     * 定义LazySingleton属性
     */
    private static LazySingleton lazySingleton = null;

    /**
     * 指定构造方法是私有的
     */
    private LazySingleton(){}

    /**
     * 全局控制点
     *
     * synchronize加锁的位置不同，线程持有的对象也会不同
     * 1 加在静态方法上，持有的是类的class文件，即当前类
     * 2 加在非静态方法上，持有的是堆内存中的对象，即执行当前方法的对象
     *
     * @return
     */
    public synchronized static LazySingleton getInstance(){
        /**
         * synchronize加锁在静态方法上等同于锁代码块时LazySingleton.class作为持有对象：
         *
         *   public  static LazyDoubleCheckSingleton getInstance(){
         *      synchronized(LazyDoubleCheckSingleton.class){
         *         if (lazySingleton == null) {
         *            lazySingleton = new LazyDoubleCheckSingleton();
         *          }
         *       }
         *      return lazySingleton;
         *    }
         */
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}