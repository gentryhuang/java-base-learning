package com.basis.java8.sort;

import com.basis.java8.entity.User;
import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ClientTest
 *
 * @author <a href="mailto:libao.huang@yunhutech.com">shunhua</a>
 * @since 2019/12/19
 * <p>
 * desc：
 * 1. java 的 sort方法默认按照属性生序的方式。如果需要降序或者多条件排序可以显示指定
 * 2. 集合的sort方法和Collections.sort方法功能是一样的
 */
public class ClientTest {
    public static void main(String[] args) {

        List<User> userList = Lists.newArrayList();
        userList.add(User.builder().name("tom").age(12).sex(1).salary(30000d).build());
        userList.add(User.builder().name("jack").age(16).sex(1).salary(2000d).build());

        // 传统排序 (以年龄升序为例)
        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        userList.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });


        // 以年龄排序（默认升序）
        userList.sort(Comparator.comparing(User::getAge));
        System.out.println(userList);

        // 以薪水降序
        Collections.sort(userList, Comparator.comparing(User::getSalary));
        System.out.println(userList);

        // 多条件生序
        userList.sort(Comparator.comparing(User::getAge).thenComparing(User::getSalary));
        System.out.println(userList);

        // age升序，salary降序
        userList.sort(Comparator.comparing(User::getAge).thenComparing(User::getSalary).reversed());

    }
}
