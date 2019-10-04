package com.design.pattern.state;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-10-04
 */
@Slf4j
public class Client {

    @Test
    public void test(){
        // 声明一个上下文
        VideoContext videoContext = new VideoContext();

        videoContext.setVideoState(new PlayState());
        log.info("当前状态：" + videoContext.getVideoState().getClass().getSimpleName());

        videoContext.pause();
        log.info("当前状态：" + videoContext.getVideoState().getClass().getSimpleName());

        videoContext.speed();
        log.info("当前状态：" + videoContext.getVideoState().getClass().getSimpleName());

        videoContext.stop();
        log.info("当前状态：" + videoContext.getVideoState().getClass().getSimpleName());

    }
}