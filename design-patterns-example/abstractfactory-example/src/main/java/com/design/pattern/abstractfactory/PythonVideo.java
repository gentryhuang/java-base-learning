package com.design.pattern.abstractfactory;

import lombok.extern.slf4j.Slf4j;

/**
 * PythonVideo
 *
 * @author shunhua
 * @date 2019-09-10
 */
@Slf4j
public class PythonVideo extends Video {

    @Override
    public void produce() {
        log.info("生产python视频");
    }
}