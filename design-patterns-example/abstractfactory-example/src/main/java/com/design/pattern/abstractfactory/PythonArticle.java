package com.design.pattern.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * PythonArticle
 *
 * @author shunhua
 * @date 2019-09-10
 */
@Slf4j
public class PythonArticle extends Article {

    @Override
    public void produce() {
        log.info("生产python笔记");
    }
}