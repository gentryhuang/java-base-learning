package com.design.pattern.singleton.lazysafedoublecheck;

/**
 * LazyDoubleCheckSingleton 双重检锁，兼顾了性能和线程安全
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
     * 双重检锁指的就是两次判断
     *
     * @return
     */
    public static LazyDoubleCheckSingleton getInstance(){
        /**
         *  1 这一层if判断如果不使用也能保证线程安全，但是锁的粒度又回到了大粒度版本。使用这一层判断是为了缩小synchronized锁的粒度
         *  2 引入了这一层会增加一个隐患-由于指令重排序，走到该层if判断lazySingleton可能确实不为空，但是它指向的对象可能还没有初始化完成，当使用这个对象的时候可能会导致系统异常
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
                    /** LazyDoubleCheckSingleton = new LazyDoubleCheckSingleton() JVM主要做的事粗略步骤如下：
                     *
                     * 1. 在堆空间里分配内存给这个对象
                     * 2. 执行构造方法进行初始化，注意此初始化不是类加载过程中的初始化
                     * 3. 设置lazySingleton指向分配好的内存地址
                     * 注意：在没有处理指令重排序的情况下2、3两步由于重排序可能步骤会倒置（因为Java语言规范，允许那些在单线程内不会改变单线程程序执行结果的重排序，因为有的重排序可以提高程序执行性能 ），这会可能会造成线程拿到的引用指向的是一个还没有初始化完成的对象，虽然不为空但它还没有执行构造方法，如果恰巧构造方法里面需要对某些参数进行初始化，当使用这个对象还没有初始化的参数时会导致系统异常
                     *
                     * 详细的步骤如下：
                     * 1. 当遇到new指令时，会先检查这个指定的参数也就是LazyDoubleCheckSingleton能否在常量池中定位到该类的符号引用，并且检查这个符号引用代表的类是否已经执行过类的加载（加载、解析、准备和初始化），如果没有就执行下一步，如果执行了接着虚拟机为新生对象分配内存（此时从虚拟机的视角来说一个新对象已经产生了），紧接着执行new指令执行之后的调用<init>方法。
                     * 2. 加载 （1 通过类的全限定名获取定义此类的二进制字节流 2 将这个字节流代表的静态存储结构转化为方法区的运行时数据结构即Class中的常量池进入方法区的运行时常量池中 3 在方法区生成一个代表这个类的Class对象）
                     * 3. 验证 （确保Class文件的字节流中包含的信息符合当前虚拟机的要求，确保虚拟机自身安全）
                     * 4. 准备 （在方法区中为类变量分配内存并设置类变量初始值）
                     * 5. 解析 （可能会发生，因为它也可能发生在初始化阶段之后。 主要作用就是将常量池中的符号引用替换为直接引用）
                     * 6. 初始化 （这是类加载过程的最后一步，主要就是执行类构造器<clinit>方法，初始化类变量）
                     *
                     * 最后：设置lazySingleton指向分配好的内存地址
                    */
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }

        }
        return lazySingleton;
    }

}