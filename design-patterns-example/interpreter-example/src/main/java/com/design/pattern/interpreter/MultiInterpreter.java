package com.design.pattern.interpreter;

/**
 * MultiInterpreter 乘法解释器
 *
 * @author shunhua
 * @date 2019-10-02
 */
public class MultiInterpreter implements Interpreter {
    /**
     * 它们的表达式结果作为乘数和被乘除数
     */
    private Interpreter firstExpression,secondExpression;

    /**
     * 乘法需要 乘数和被乘数
     * @param firstExpression
     * @param secondExpression
     */
    public MultiInterpreter(Interpreter firstExpression,Interpreter secondExpression){
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    /**
     * 乘法解释器的解释方法
     * @return
     */
    @Override
    public int interpret() {
        return this.firstExpression.interpret() * this.secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}