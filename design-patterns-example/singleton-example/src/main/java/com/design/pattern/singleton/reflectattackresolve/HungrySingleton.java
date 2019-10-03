package com.design.pattern.singleton.reflectattackresolve;

/**
 * HungrySingleton 饿汉式
 * <p>
 * 1 优点
 * 写法简单，类加载（严格来说是类加载过程的初始化阶段以及调用构造函数）的时候就完成了对象的创建，避免了线程同步问题
 * 2 缺点
 * 类加载的时候就完成了对象的创建，没有延迟效果，如果类的对象从始至终都没有用过，或者只是想获取类的某个类变量，那么还是会创建对象，这无疑造成了内存的浪费
 *
 *
 * @author shunhua
 * @date 2019-10-03
 */
public class HungrySingleton {

     // private final static HungrySingleton singleton = new HungrySingleton();

    private final static HungrySingleton singleton;

    /**
     * 私有构造函数
     */
    private HungrySingleton() {
        if(singleton == null){
            System.out.println("调用构造方法在赋值引用给singleton之前，这是指令重排序带来的可能");
        }else {
            System.out.println("调用构造方法在赋值引用给singleton之后，这是指令重排序带来的可能");
        }
    }

    /**
     * 声明为final的变量必须在类加载完成时（准确的是类加载初始化的时候，singleton就需要被赋值即HungrySingleton对象的引用）就已经赋值
     */

    static {
        singleton = new HungrySingleton();
    }

    /**
     * 全局访问点
     * @return
     */
    public static HungrySingleton getInstance() {
        return singleton;
    }

}