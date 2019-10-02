package com.design.pattern.interpreter.resource;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * SpelParserTest
 *
 * @author shunhua
 * @date 2019-10-02
 */
@Slf4j
public class SpelParserTest {

    /**
     *  使用Spring的语言解释器(ExpressionParser) 解释Spring的EL（解释语言）表达式
     */
    @Test
    public void test() {
        // 创建Spring的语言解释器
        ExpressionParser parser = new SpelExpressionParser();
        // 使用解释解析Spring的El表达式
        Expression expression = parser.parseExpression("2 * 100 * 10 + 19");
        // 取出结果
        int result = (Integer) expression.getValue();
        log.info("解释后的结果：" + result);
    }
}