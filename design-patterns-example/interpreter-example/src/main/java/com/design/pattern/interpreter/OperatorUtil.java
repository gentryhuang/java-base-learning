package com.design.pattern.interpreter;

/**
 * OperatorUtil
 *
 * @author shunhua
 * @date 2019-10-02
 */
public class OperatorUtil {
    /**
     * 是否可操作
     * @param symbol
     * @return
     */
    public static boolean isOperator(String symbol){
        return "+".equals(symbol) || "*".equals(symbol);
    }

    /**
     * 使用解释器进行解释，表达式的结果
     * @param firstExpression
     * @param secondExpression
     * @param symbol
     * @return
     */
    public static Interpreter getExpressionObject(Interpreter firstExpression,Interpreter secondExpression,String symbol){
        if("+".equals(symbol)){
            return new AddInterpreter(firstExpression,secondExpression);
        }
        else if ("*".equals(symbol)){
            return new MultiInterpreter(firstExpression,secondExpression);
        }
        return null;
    }
}