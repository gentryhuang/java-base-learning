package com.design.pattern.template;

import lombok.extern.slf4j.Slf4j;

/**
 * JvmCource
 *
 * @author shunhua
 * @date 2019-09-27
 */
@Slf4j
public class JvmCource extends Course {

    private boolean flag = Boolean.FALSE;

    /**
     * 通过构造方法设置钩子方法的参数，把钩子方法开放给客户端更加灵活
     *
     * @param flag
     */
    public JvmCource(boolean flag){
        this.flag = flag;
    }

    @Override
    void packageCourse() {
        log.info("Jvm课程提供调优工具软件包");
    }

    /**
     * 使用钩子方法来和父类交互，增加自己的逻辑
     * @return
     */
    @Override
    protected boolean needMakeArticle() {
        return flag;
    }
}