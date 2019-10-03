package com.design.pattern.singleton.serializationdestroysingleton;

import java.io.Serializable;

/**
 * HungrySingleton 饿汉式
 * <p>
 * 1 优点
 * 写法简单，类加载（严格来说是类加载过程的初始化阶段以及调用构造函数）的时候就完成了对象的创建，避免了线程同步问题
 * 2 缺点
 * 类加载的时候就完成了对象的创建，没有延迟效果，如果类的对象从始至终都没有用过，或者只是想获取类的某个类变量，那么还是会创建对象，这无疑造成了内存的浪费
 * 3 实现Serializable，为了实现序列化
 *
 * @author shunhua
 * @date 2019-10-03
 */
public class HungrySingleton implements Serializable {
    private static final long serialVersionUID = 1136799709809340054L;

    /**
     * 私有构造函数
     */
    private HungrySingleton() {
    }

    /**
     * 声明为final的变量必须在类加载完成时（准确的是类加载初始化的时候，singleton就需要被赋值即HungrySingleton对象的引用）就已经赋值
     */
    // private final static HungrySingleton singleton = new HungrySingleton();

    private final  static HungrySingleton singleton;
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

    /**
     * 1. 对于使用序列化和反序列化产生新的实例的方式破坏了单例，可以在类中增加readResolve()方法来预防，readResolve（）方法返回单例对象即可
     * 2. 这是反序列化机制决定的，在反序列化的时候会判断类如果实现了Serializable或者Externalizable接口又包含readResolve()方法的话，会直接
     * 调用readResolve（）方法来获取实例。值得注意的是，readObject方法底层会先通过反射创建一个新的单例实例，然后再通过反射调用readResolve方
     * 法获取单例对象。即虽然最后通过readResolve拿到的是已经创建好的对象，但本质上还是通过反射创建了一个新的对象，只是这个新的对象是用来调用readResolve方法
     * 返回单例对象而已。
     *
     *
     * @return
     */
    public Object readResolve(){
        return singleton;
    }

}