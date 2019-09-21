package com.design.pattern.principle;

import com.design.pattern.principle.liskovSubstitutation.inputmethod.Child;
import org.junit.Test;

import java.util.HashMap;

/**
 * LiskovSubstitutation
 *
 * @author shunhua
 * @date 2019-09-15
 */
public class LiskovSubstitutation {

    @Test
    public void test(){
        Child child = new Child();
        HashMap hashMap = new HashMap(2);
        child.method(hashMap);
    }
}