package com.design.pattern.abstractfactory;

/**
 * CourseFactory
 *
 * @author shunhua
 * @date 2019-09-10
 */
public interface CourseFactory {
    /**
     * 生产视频
     * @return
     */
    Video getVideo();
    /**
     * 生产笔记
     * @return
     */
    Article getArticle();
}
