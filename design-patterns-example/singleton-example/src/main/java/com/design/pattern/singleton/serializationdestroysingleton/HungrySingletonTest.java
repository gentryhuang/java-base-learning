package com.design.pattern.singleton.serializationdestroysingleton;
import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * HungrySingletonTest
 *
 * @author shunhua
 * @date 2019-10-03
 */
@Slf4j
public class HungrySingletonTest {

    public static void main(String[] args) {
       HungrySingleton instance = HungrySingleton.getInstance();
        try {

            File file = new File("singleton");

            // 使用ObjectOutputStream对象输出流，把单例对象写入文件中。注意文件的后缀名带不带都行。如果不指定文件的路径，就默认使用当前工程的目录作为路径
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            // 将单例对象写入文件中
            objectOutputStream.writeObject(instance);

            // 使用ObjectInputStream对象输入流，把文件中的单例对象读到内存中
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

            /**
             *
             * 如果HungrySingleton类实现了Serializable或者Externalizable接口，那么readObject方法底层会使用反射，调用ObjectStreamClass#newInstance方法创建一个新的单例对象,
             * 这个单例对象是为了调用它对应的类中的readResolve方法，如果没有实现那两个接口中的任何一个就会返回null。即接着会判断这个新创建的单例对象中有没有readResolve方法，如果
             * 有就会通过反射调用这个readResolve方法，最终readObject方法返回的是readResolve方法返回的对象
             *
             */

            HungrySingleton newInstance = (HungrySingleton) objectInputStream.readObject();

            log.info("instance: " + instance);
            log.info("newInstance: " + newInstance);
            log.info(String.format("instance [%s] newInstance", instance == newInstance));

        } catch (Exception e) {

        }

    }

}