package com.design.pattern.visitor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-10-05
 */
public class Client {

    @Test
    public void test(){
        List<Course> courseList = new ArrayList<>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("这是一个免费的课程");

        PayCourse payCourse = new PayCourse();
        payCourse.setName("这是一个付费的课程");
        payCourse.setPrice(300);

        courseList.add(freeCourse);
        courseList.add(payCourse);

        // 普通访问者
        GeneralVisitor generalVisitor = new GeneralVisitor();
        // Vip用户
        VipVisitor vipVisitor = new VipVisitor();

        System.out.println("//----------普通访问者----------------/");
        courseList.stream().forEach(course -> {
            course.accept(generalVisitor);
        });

        System.out.println("//----------vip用户------------------/");
        courseList.stream().forEach(course -> {
            course.accept(vipVisitor);
        });

    }
}