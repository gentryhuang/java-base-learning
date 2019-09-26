package com.design.pattern.template;

import lombok.extern.slf4j.Slf4j;

/**
 * FECourse
 *
 * @author shunhua
 * @date 2019-09-27
 */
@Slf4j
public class FECourse extends Course {

    /**
     * 重写打包课程的方法
     */
    @Override
    void packageCourse() {
        log.info("提供前端课程的源代码和图片素材");
    }
}