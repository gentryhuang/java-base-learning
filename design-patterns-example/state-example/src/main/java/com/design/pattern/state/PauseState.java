package com.design.pattern.state;

import lombok.extern.slf4j.Slf4j;

/**
 * PauseState  视频暂停状态
 *
 * @author shunhua
 * @date 2019-10-05
 */
@Slf4j
public class PauseState extends VideoState {

    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
      super.videoContext.setVideoState(VideoContext.SPEED_STATE);
    }

    @Override
    public void pause() {
        log.info("视频暂停播放状态");
    }

    @Override
    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
    }
}