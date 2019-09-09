package com.common.base;

/**
 * ObjectUtils
 *
 * @author shunhua
 * @date 2019-09-09
 */
public class ObjectUtils {

   public static boolean isNull(Object object){
       if(object == null){
           return true;
       }
       return false;
   }

   public static boolean isNotNull(Object object){
       if(object != null){
           return true;
       }
       return false;
   }
}