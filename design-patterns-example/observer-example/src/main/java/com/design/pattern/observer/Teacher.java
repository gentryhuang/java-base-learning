package com.design.pattern.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

/**
 * Teacher
 *
 * 1 观察的是课程，而不是问题，问题属于课程 。 Teacher属于观察者
 * 2 必须实现Observer接口，表示它是一个观察者
 *
 * @author shunhua
 * @date 2019-10-02
 */
@Data
@AllArgsConstructor
@Slf4j
public class Teacher implements Observer {
    /**
     * 老师名称
     */
    private String name;

    /**
     *
     * @param o  被观察对象
     * @param arg  被观察者的notifyObservers方法传递过来的对象
     */
    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        // 业务逻辑...
        log.info(String.format("%s课程被%s同学提出%s的问题，需要%s解答",course.getName(),question.getUserName(),question.getQuestionContent(),name));
    }
}