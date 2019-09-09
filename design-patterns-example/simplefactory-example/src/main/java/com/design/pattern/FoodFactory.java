package com.design.pattern;

/**
 * 简单工厂
 *
 * @author shunhua
 * @date 2019-09-09
 */
public class FoodFactory {

    /**
     * 随着要产品增多，以下逻辑必须要修改
     * @param type  这里使用字符串根据类型进行创建不同的实例
     * @return
     */
    public Food createFood(String type){
        if("salad".equalsIgnoreCase(type)){
            return new Salad();
        }else if("bread".equalsIgnoreCase(type)){
            return new Bread();
        }
        return null;
    }

    /**
     *
     * @param c  这里使用反射创建不同的实例
     * @return
     */
    public Food createFood(Class c){
        Food food = null;
        try {
            food = (Food) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return food;
    }
}