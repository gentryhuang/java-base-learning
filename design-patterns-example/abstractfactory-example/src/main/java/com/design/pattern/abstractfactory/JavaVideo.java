package com.design.pattern.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * JavaVideo
 *
 * @author shunhua
 * @date 2019-09-10
 */
@Slf4j
public class JavaVideo extends Video {

    @Override
    public void produce() {
        log.info("生成Java视频资源");
    }
}