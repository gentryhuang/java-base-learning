package com.design.pattern.principle;

import com.design.pattern.principle.openclose.ICourse;
import com.design.pattern.principle.openclose.JavaCourse;
import com.design.pattern.principle.openclose.JavaDiscountCourse;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * OpencloseTest
 *
 * @author shunhua
 * @date 2019-09-01
 */
@Slf4j
public class OpencloseTest {

    @Test
    public void testBase(){
        ICourse javaCourse = new JavaCourse(100,"Java从入门到放弃",200d);
        log.info(String.format("课程id: %d,课程名: %s, 课程价格：%f",
                javaCourse.getId(),
                javaCourse.getName(),
                javaCourse.getPrice())
        );
    }

    @Test
    public void testEx(){
        ICourse javaCource = new JavaDiscountCourse(100,"java从入门到放弃",200d);
       log.info(String.format("课程id: %d,课程名: %s, 课程原价：%f，课程折扣价格：%f",
               javaCource.getId(),
               javaCource.getName(),
               ((JavaDiscountCourse) javaCource).getOriginPrice(),
               javaCource.getPrice())
       );
    }

}