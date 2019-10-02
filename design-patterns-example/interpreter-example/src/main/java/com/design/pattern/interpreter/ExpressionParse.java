package com.design.pattern.interpreter;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Stack;

/**
 * ExpressionParse 暴露对外的解释器
 *
 * @author shunhua
 * @date 2019-10-02
 */
@Slf4j
public class ExpressionParse {
    /**
     * 定义一个栈，这里是解释器类型栈
     */
    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str){

        String[] strItemArray = str.split(" ");
        Arrays.stream(strItemArray).forEach(symbol ->{
            // 不是运算符，需要入栈
            if(!OperatorUtil.isOperator(symbol)){
                Interpreter numberExpression = new NumberInterpreter(symbol);
                stack.push(numberExpression);
                log.info(String.format("入栈：%d",numberExpression.interpret()));
            }else {
                // 是运算符，可以进行计算
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                log.info(String.format("出栈： %d 和 %d",firstExpression.interpret(),secondExpression.interpret()));
                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression,secondExpression,symbol);
                log.info(String.format("解释器类型：%s",operator.toString()));
                int result = operator.interpret();
                NumberInterpreter resultExpression  = new NumberInterpreter(result);
                stack.push(resultExpression);
                log.info(String.format("阶段结果入栈： %d",resultExpression.interpret()));
            }
        });

        int result = stack.pop().interpret();
        return result;
    }
}