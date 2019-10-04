package com.design.pattern.state;

import lombok.extern.slf4j.Slf4j;

/**
 * StopState 视频停止状态
 *
 * @author shunhua
 * @date 2019-10-05
 */
@Slf4j
public class StopState extends VideoState {

    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
       log.info("停止状态不能快进");
    }

    @Override
    public void pause() {
       log.info("停止状态不能暂停");
    }

    @Override
    public void stop() {
        log.info("视频停止播放状态");
    }
}