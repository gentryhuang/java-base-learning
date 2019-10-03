package com.design.pattern.singleton.staticinnerclass;

/**
 * StaticInnerClassSingleton 静态内部类的单例模式 ，使用静态内部类也是做延迟初始化单例对象，来降低单例实例的开销即在需要的时候才进行初始化
 *
 * @author shunhua
 * @date 2019-10-03
 */
public class StaticInnerClassSingleton {

    /**
     * 私有构造器不能少，防止外部创建对象，让外部只能通过全局访问点拿到单例对象
     */
    private StaticInnerClassSingleton(){}

    /**
     * 1. 这个静态内部类要声明为私有的，因为创建对象在它里面，不能让外面访问它
     * 2. 如果类没有初始化，需要类立即初始化的常见情况：
     *   （1）new 一个对象
     *   （2）类中声明的静态方法被调用
     *   （3）类中声明的一个静态成员被赋值
     *   （4）类中声明的一个静态成员被使用，并且这个成员不是一个常量（被final修饰，已在编译期把结果放入常量池中的静态字段）
     *   （5）对类进行反射调用
     *   （6）作为父类（包括接口），其子类被初始化了，那么父类需要先初始化
     *   （7）执行的主类（包含main方法的类）
     *
     * 3.使用静态内部类创建单例对象利用了类加载过程中的初始化阶段的特性：
     *  虚拟机会保证一个类的类构造器<clinit>方法在多线程环境中被正确地加类的对象初始化锁（这是JVM帮我们自动完成的）、同步，如果多个线程同时去初始化一个类，
     *  那么只会有一个线程去执行这个类的类构造器方法<clinit>，其他线程都需要阻塞等待，直到活动线程执行<clinit>方法完毕。
     *  因此，即使在多线程环境下执行 private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton()语句
     *  也不需要关心指令重排序的情况，因为初始化阶段在对类变量赋值的时候只会有一个线程可以执行<clinit>方法，而单线程执行的情况下，指令是否重排序是没有影响的。
     */
    private static class InnerClass {
        /**
         * 1. 初始化时，需要staticInnerClassSingleton赋值，即 new StaticInnerClassSingleton()会被执行。这些都是<clinit>方法执行的结果，而<clinit>方法在多线程环境下只会有一个线程执行，即使这个方法内部涉及重排序也关系。
         * 2. 活跃线程初始化类（执行<clinit>方法）后,类已经初始化完成，不会再进行初始化，其他线程直接访问类成员即可
         */
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    /**
     * 全局访问点
     *
     * 当执行getInstance方法时就去调用InnerClass内部类里面的staticInnerClassSingleton实例，此时InnerClass内部类会被加载到内存里，在类加载的时候就创建对象，和饿汉式一个道理，保证了只有一个实例，
     * 而且在调用getInstance方法时才进行单例的创建，又具有懒汉式的部分特性。
     * @return
     */
    public static StaticInnerClassSingleton getInstance() {
        /**
         * 外部访问getInstance这个全局访问点时，会间接访问InnerClass的静态成员，这会导致静态内部类被初始化
         */
        return InnerClass.staticInnerClassSingleton;
    }

}