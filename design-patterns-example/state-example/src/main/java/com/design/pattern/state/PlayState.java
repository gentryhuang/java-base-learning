package com.design.pattern.state;

import lombok.extern.slf4j.Slf4j;

/**
 * PlayState  视频播放状态
 *
 * @author shunhua
 * @date 2019-10-05
 */
@Slf4j
public class PlayState extends VideoState {

    @Override
    public void play() {
      log.info("视频正常播放状态");
    }

    /**
     * 可切换快进
     */
    @Override
    public void speed() {
        super.videoContext.setVideoState(VideoContext.SPEED_STATE);
    }

    /**
     * 可切换暂停
     */
    @Override
    public void pause() {
      super.videoContext.setVideoState(VideoContext.PAUSE_STATE);
    }

    /**
     * 可切换停止
     */
    @Override
    public void stop() {
      super.videoContext.setVideoState(VideoContext.STOP_STATE);
    }
}