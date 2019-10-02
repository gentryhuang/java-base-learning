package com.design.pattern.observer;

import lombok.Builder;
import lombok.Data;

/**
 * Question
 *
 * @author shunhua
 * @date 2019-10-02
 */
@Data
@Builder
public class Question {
    /**
     * 问题提问者名称
     */
    private String userName;
    /**
     * 具体问题
     */
    private String questionContent;
}