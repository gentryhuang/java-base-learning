package test;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * BaseDAO
 *
 * @author <a href="mailto:libao.huang@yunhutech.com">shunhua</a>
 * @since 2019/12/19
 * <p>
 * desc：
 */
public class BaseDAO<T> {

    private Class<T> entityClass;

    public BaseDAO() {
        //getClass()获得一个实例的类型类;相当于 某类.class eg:UserDao.class
        Class class1 = getClass();
        System.out.println(class1);

        //getSuperclass()获得该类的父类
        Class superclass = class1.getSuperclass();
        System.out.println(superclass);

        //getGenericSuperclass()获得带有泛型的父类
        //Type是 Java 编程语言中所有类型的公共高级接口。它们包括原始类型、参数化类型、数组类型、类型变量和基本类型
        Type type = class1.getGenericSuperclass();
        System.out.println(type);

        //ParameterizedType参数化类型，即泛型
        ParameterizedType p=(ParameterizedType)type;
        //getActualTypeArguments获取参数化类型的数组，泛型可能有多个
        entityClass=(Class<T>) p.getActualTypeArguments()[0];
        System.out.println(entityClass);

        // BaseDAO是否是T对应的父类型
        boolean assignableFrom = BaseDAO.class.isAssignableFrom(entityClass);
        System.out.println(assignableFrom);


    }



}
