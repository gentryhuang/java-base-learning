package com.design.pattern.state;

import lombok.Setter;

/**
 * VideoState 视频状态
 *
 * @author shunhua
 * @date 2019-10-05
 */
@Setter
public abstract class VideoState {
    /**
     * 视频资源上下文
     */
    protected VideoContext videoContext;

    /**
     * 播放
     */
    public abstract void play();

    /**
     * 快进
     */
    public abstract void speed();

    /**
     * 暂停
     */
    public abstract void pause();

    /**
     * 停止
     */
    public abstract void stop();

}