package com.design.pattern.singleton.enuminstance;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * EnumInstanceTest
 *
 * @author shunhua
 * @date 2019-10-03
 */
@Slf4j
public class EnumInstanceTest {

    public static void main(String[] args) {

        EnumInstance instance = EnumInstance.getInstance();
        instance.setData(new Object());

        try {
            //------------------ 枚举实现的单例，是不受序列化破坏的影响---------------------/

            File file = new File("singleton");

            // 使用ObjectOutputStream对象输出流，把单例对象写入文件中。注意文件的后缀名带不带都行。如果不指定文件的路径，就默认使用当前工程的目录作为路径
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            // 将单例对象写入文件中
            objectOutputStream.writeObject(instance);

            // 使用ObjectInputStream对象输入流，把文件中的单例对象读到内存中
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            EnumInstance newInstance = (EnumInstance) objectInputStream.readObject();

            /**
               readObject方法调用的核心方法：这个逻辑保证了取出的枚举对象的唯一性

              private Enum<?> readEnum(boolean unshared) throws IOException {
                   if (bin.readByte() != TC_ENUM) {
                        throw new InternalError();
                      }

                     ObjectStreamClass desc = readClassDesc(false);
                  if (!desc.isEnum()) {
                       throw new InvalidClassException("non-enum class: " + desc);
                     }

                  int enumHandle = handles.assign(unshared ? unsharedMarker : null);
                  ClassNotFoundException resolveEx = desc.getResolveException();
                 if (resolveEx != null) {
                     handles.markException(enumHandle, resolveEx);
                   }
                 // 获取枚举对象的名称，这个是唯一的，它对应一个枚举常量
                 String name = readString(false);
                 Enum<?> result = null;
                 // 获取枚举对象的Class
                 Class<?> cl = desc.forClass();
                if (cl != null) {
                  try {
                     // 通过枚举对象的Class和枚举对象的名称获取对应的枚举常量，没有创建新的对象
                     @SuppressWarnings("unchecked")
                     Enum<?> en = Enum.valueOf((Class)cl, name);
                     result = en;
                   } catch (IllegalArgumentException ex) {
                      throw (IOException) new InvalidObjectException(
                        "enum constant " + name + " does not exist in " +
                        cl).initCause(ex);
                   }
                if (!unshared) {
                    handles.setObject(enumHandle, result);
                   }
               }

                handles.finish(enumHandle);
                passHandle = enumHandle;
                return result;
           }
             */

            log.info("instance: " + instance);
            log.info("newInstance: " + newInstance);
            log.info(String.format("instance [%s] newInstance", instance == newInstance));

            System.out.println("------------------------------------------");

            log.info("instance: " + instance.getData());
            log.info("newInstance: " + newInstance.getData());
            log.info(String.format("instance.data [%s] newInstance.data", instance.getData() == newInstance.getData()));

            //-------------------------- 枚举实现的单例,不受反射破坏的影响， ----------------/

            Class enumClass = EnumInstance.class;
            Constructor constructor = enumClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            /**
             * 通过反射调用枚举的构造器（构造器只有有参构造）会抛出异常，防止了反射攻击
             */

        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }

}