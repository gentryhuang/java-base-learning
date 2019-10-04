package com.design.pattern.state;

/**
 * VideoContext 上下文，某一时刻上下文中只有一种状态，切换状态都是通过设置上下文中的状态，获取也是获取上下文中的状态
 *
 * @author shunhua
 * @date 2019-10-05
 */
public class VideoContext {
    /**
     * 视频状态
     */
    private VideoState videoState;

    /**
     * 播放状态
     */
    public final static PlayState PLAY_STATE = new PlayState();
    /**
     * 加速状态
     */
    public final static SpeedState SPEED_STATE = new SpeedState();
    /**
     * 暂停状态
     */
    public final static PauseState PAUSE_STATE = new PauseState();
    /**
     * 停止状态
     */
    public final static StopState STOP_STATE = new StopState();

    /**
     * getter
     *
     * @return
     */
    public VideoState getVideoState() {
        return videoState;
    }

    /**
     * setter
     *
     * @param videoState
     */
    public void setVideoState(VideoState videoState) {
        this.videoState = videoState;
        /**设置VideoContext上下文中当前状态的上下文是自己本身，这个必须设置，要保证某一时刻上下文中只有一种状态，并且状态离不开上下文*/
        this.videoState.setVideoContext(this);
    }

    public void play(){
        this.videoState.play();
    }

    public void stop(){
        this.videoState.stop();
    }

    public void speed(){
        this.videoState.speed();
    }

    public void pause(){
        this.videoState.pause();
    }


}