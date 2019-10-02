package com.design.pattern.observer;

import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-10-02
 */
public class Client {

    @Test
    public void test(){
        Course course = new Course("《Java从入门到放弃》");
        Teacher teacher = new Teacher("Java学院老师");
        Teacher teacher1 = new Teacher("鼓励师");
        // 为课程添加观察者
        course.addObserver(teacher);
        course.addObserver(teacher1);

        // 添加课程的问题
        course.addQuestion(Question.builder()
                .userName("gentryhuang")
                .questionContent("Java学不完，需要放弃吗？")
                .build());
        course.addQuestion(Question.builder()
                .userName("xw")
                .questionContent("快看，又一个学Java的转行了，要跑路吗？")
                .build());

        // 主题对象发生变化（有问题提出了）
        course.produceQuestion(course);

    }
}