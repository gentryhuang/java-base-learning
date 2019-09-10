package com.design.pattern.abstractfactory;

import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-10
 */
public class Client {

    @Test
    public void test(){
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}