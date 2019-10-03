package com.design.pattern.singleton.enuminstance;

/**
 * EnumInstance  使用枚举的方式实现单例模式
 *
 * 1. 枚举实际上是一个继承Enum的被final修饰的类，它的构造方法（只有有参构造方法）也是私有的。其中枚举常量也是static final的，并且在static代码块中实例化（和恶汉式很像）
 * 2. 枚举实现的单例防止了序列化攻击（readObject方法执行获取的对象是已经存在的枚举常量）和反射攻击（枚举类的构造函数会判断，如果通过反射调用就抛出异常）以及线程安全
 * 3. 推荐使用枚举实现单例
 *
 * @author shunhua
 * @date 2019-10-03
 */
public enum EnumInstance {

    /**
     * 枚举常量
     */
    INSTANCE;
    /**
     * 枚举的成员变量
     */
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 暴露给外部的全局点
     *
     * @return
     */
    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
