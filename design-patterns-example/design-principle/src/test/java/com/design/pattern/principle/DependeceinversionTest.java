package com.design.pattern.principle;

import com.design.pattern.principle.dependenceinversion.JavaCourse;
import com.design.pattern.principle.dependenceinversion.Person;
import com.design.pattern.principle.dependenceinversion.PythonCourse;
import org.junit.Test;

/**
 * DependeceinversionTest
 *
 * @author shunhua
 * @date 2019-09-02
 */
public class DependeceinversionTest {

   /* @Test
    public void test(){
        Person person = new Person();
        person.studyJava();
        person.studyPython();
    }
 */

   @Test
    public void test(){
       Person person = new Person();
       person.learnCource(new JavaCourse());
       person.learnCource(new PythonCourse());
   }

}