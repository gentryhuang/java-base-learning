package com.design.pattern.interpreter;

/**
 * NumberInterpreter 表达式处理解释器
 *
 * @author shunhua
 * @date 2019-10-02
 */
public class NumberInterpreter implements Interpreter {
    /**
     *  表达式要返回的值
     */
    private int number;

    /**
     * 数值构造器
     * @param number
     */
    public NumberInterpreter(int number){
        this.number = number;
    }

    /**
     * 字符串转换构造器
     * @param number
     */
    public NumberInterpreter(String number){
        this.number = Integer.parseInt(number);
    }

    /**
     * 解释方法
     * @return
     */
    @Override
    public int interpret() {
        return this.number;
    }
}