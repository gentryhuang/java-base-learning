package com.design.pattern.interpreter;

/**
 * AddInterpreter 加法解释器
 *
 * @author shunhua
 * @date 2019-10-02
 */
public class AddInterpreter implements Interpreter {

    /**
     * 它们的方法返回值作为加数和被加数
     */
    private Interpreter firstExpression,secondeExpression;

    /**
     * 加法需要 加数和被加数
     * @param firstExpression
     * @param secondeExpression
     */
    public AddInterpreter(Interpreter firstExpression,Interpreter secondeExpression){
        this.firstExpression = firstExpression;
        this.secondeExpression = secondeExpression;
    }

    /**
     * 返回两个表达式结果的和
     * @return
     */
    @Override
    public int interpret() {
        return this.firstExpression.interpret() + this.secondeExpression.interpret();
    }

    @Override
    public String toString() {
        return  "+";
    }
}