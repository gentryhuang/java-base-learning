package com.design.pattern.principle.liskovSubstitutation.outputmethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Child
 *
 * @author shunhua
 * @date 2019-09-15
 */
public class Child extends Base {

    /**
     * 子类的出参如果包含父类，会直接报错。
     * @return
     */
   /* @Override
    public Object method() {
        return null;
    }*/

    /**
     * 父类的出参包含子类的出参是可以的
     * @return
     */
   @Override
   public HashMap method(){
       return new HashMap(2);
   }


}