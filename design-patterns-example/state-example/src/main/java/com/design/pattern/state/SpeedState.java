package com.design.pattern.state;

import lombok.extern.slf4j.Slf4j;

/**
 * SpeedState 视频加速状态
 *
 * @author shunhua
 * @date 2019-10-05
 */
@Slf4j
public class SpeedState extends VideoState {

    @Override
    public void play() {
        super.videoContext.setVideoState(VideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
      log.info("视频快进播放状态");
    }

    @Override
    public void pause() {
      super.videoContext.setVideoState(VideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.videoContext.setVideoState(VideoContext.STOP_STATE);
    }
}