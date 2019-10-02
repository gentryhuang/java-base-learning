package com.design.pattern.interpreter;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-10-02
 */
@Slf4j
public class Client {

    @Test
    public void test(){
        // 输入表达式
        String inputStr = "18 70 12 + *";
        // 对表达式进行解释
        ExpressionParse expressionParse = new ExpressionParse();
        int result = expressionParse.parse(inputStr);
        log.info("最终解释结果：" + result);
    }

}