package com.design.pattern.interpreter.resource;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * PatternTest
 *
 * @author shunhua
 * @date 2019-10-02
 */
@Slf4j
public class PatternTest {
    @Test
    public void test(){
        String str = "china";
        String patternStr = "\\s+" + str + "\\s+";
        // 正则解释器，解释正则表达式
        Pattern pattern = Pattern.compile(patternStr);
        String content = " china becames more and more beautiful! ";
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            String content_new  = matcher.replaceAll("China ");
            log.info(String.format("old: %s, new: %s",content,content_new));
        }
    }
}