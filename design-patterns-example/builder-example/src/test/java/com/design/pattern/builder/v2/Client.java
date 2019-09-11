package com.design.pattern.builder.v2;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-11
 */
@Slf4j
public class Client {
   @Test
    public void test(){
       Course course = new Course.CourseBuilder()
               .buildName("java进阶")
               .buildSource("ppt课件")
               .buildVideo("java进阶视频")
               .build();
      log.info(course.toString());
   }
}