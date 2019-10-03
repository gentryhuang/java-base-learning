package com.design.pattern.singleton.reflectattackresolve;


import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;

/**
 * HungrySingletonTest
 *
 * 反射破坏单例模式不容易彻底阻止，没有特别好的方式。
 *
 * @author shunhua
 * @date 2019-10-03
 */
@Slf4j
public class HungrySingletonTest {

    /**
     * 对于在类加载的整个过程实例就能创建好的单例模式（恶汉式、静态内部类），为了防止反射攻击，可以在构造方法中进行判断，如果是通过反射创建对象就抛出异常
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        try {
            // 获取hungrySingleton的Class对象
            Class objectClass = HungrySingleton.class;

            // 通过全局访问点拿到单例对象
            HungrySingleton instance = HungrySingleton.getInstance();

            // 获取声明的构造器
            Constructor constructor = objectClass.getDeclaredConstructor();
            // 强制设置声明的构造器是可以访问的
            constructor.setAccessible(true);
            // 通过构造器反射创建对象
            HungrySingleton newInstance = (HungrySingleton) constructor.newInstance();

            log.info("instance: " + instance);
            log.info("newInstance： " + newInstance);
            log.info(String.format("instance [%s] newInstance",instance == newInstance));

        }catch (Exception e){
          log.info(e.getMessage());
        }



    }

}