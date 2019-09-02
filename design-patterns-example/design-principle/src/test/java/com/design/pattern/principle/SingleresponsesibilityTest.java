package com.design.pattern.principle;

import com.design.pattern.principle.singleresponsibility.Bird;
import org.junit.Test;

/**
 * SingleresponsesibilityTest
 *
 * @author shunhua
 * @date 2019-09-02
 */
public class SingleresponsesibilityTest {

    @Test
    public void test(){
        Bird bird = new Bird();
        bird.moveMode("大雁");
        bird.moveMode("鸵鸟");
    }
}