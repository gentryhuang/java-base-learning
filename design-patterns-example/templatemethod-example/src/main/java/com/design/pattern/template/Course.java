package com.design.pattern.template;

import lombok.extern.slf4j.Slf4j;

/**
 * Course  课程抽象类
 *
 * @author shunhua
 * @date 2019-09-27
 */
@Slf4j
public abstract class Course {

    /**
     * 模版方法 定义流程的
     * 1 该方法的流程是固定的，有些步骤的细节可能因子类不同
     * 2 该方法必须申明为final，子类不能重写。
     */
    protected final void makeCourse(){
        // 制作PPT
        makePPT();
        // 制作视频
        makeVideo();
        // 通过构造方法实现所需逻辑
        if(needMakeArticle()){
            // 编写手稿
            makeArticle();
        }
        // 打包课程上线
        packageCourse();
    }

    /**
     * 制作PPT是共有的方法，因此是固定的，子类不需要有自己的实现
     */
    final void makePPT(){
       log.info("制作ppt");
    }

    /**
     * 制作视频是共有的方法，因此是固定的，子类不需要有自己的实现
     */
    final void makeVideo(){
        log.info("制作视频");
    }

    /**
     * 编写手记，这个是固定的不需要之类有自己的实现，不过它不一定是共有的，需要看情况
     */
    final void makeArticle(){
        log.info("编写手记");
    }

    /**
     * 钩子方法  子类可以重写用来跟父类交互的。默认是false，不需要手记
     */
    protected boolean needMakeArticle(){
        return false;
    }

    /**
     * 打包课程的方法，不同的课程可能包装的不一样，根据子类情况重写
     */
    abstract void packageCourse();

}