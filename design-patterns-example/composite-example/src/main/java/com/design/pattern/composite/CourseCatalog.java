package com.design.pattern.composite;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * CourseCatalog  课程目录类
 *
 * @author shunhua
 * @date 2019-09-24
 */
@Slf4j
public class CourseCatalog extends CourseComponet {
    /**
     * 课程目录下的课程集合
     */
    private List<CourseComponet> items = new ArrayList<>();
    /**
     * 课程目录名
     */
    private String catalogName;

    public CourseCatalog(String catalogName){
        this.catalogName = catalogName;
    }

    /**
     * 为课程目录添加课程
     * @param courseComponet
     */
    @Override
    public void addCatalog(CourseComponet courseComponet) {
        this.items.add(courseComponet);
    }

    /**
     * 删除课程目录中的课程
     * @param courseComponet
     */
    @Override
    public void removeCatalog(CourseComponet courseComponet) {
      this.items.remove(courseComponet);
    }

    @Override
    public String getName(CourseComponet courseComponet) {
        return this.catalogName;
    }

    @Override
    public void print() {
        log.info(catalogName);
        for(CourseComponet courseComponet : items){
            courseComponet.print();
        }
    }
}