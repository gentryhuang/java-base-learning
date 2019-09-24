package com.design.pattern.composite;

import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-24
 */
public class Client {

    @Test
    public void test(){
        CourseComponet catalog = new CourseCatalog("课程顶级目录");

        CourseComponet linuxCourse = new Course("鸟哥私房菜",80);
        CourseComponet gitCourse = new Course("Git权威指南",120);

        CourseComponet javaCatalog = new CourseCatalog("Java课程目录");
        CourseComponet spring = new Course("Spring实战",70);
        CourseComponet mybatis = new Course("MyBatis技术内幕",60);

        javaCatalog.addCatalog(spring);
        javaCatalog.addCatalog(mybatis);

        catalog.addCatalog(linuxCourse);
        catalog.addCatalog(gitCourse);
        catalog.addCatalog(javaCatalog);

        // 课程目录就打印出
        catalog.print();
    }
}