package com.design.pattern.observer;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Course
 * 1 它下面有问题，Course属于被观察者，也就是主题对象
 * 2 作为被观察者必须继承Observable类，标志是可观察的
 *
 * @author shunhua
 * @date 2019-10-02
 */
@Data
@Slf4j
public class Course extends Observable {
    /**
     * 课程名
     */
    private String name;
    /**
     * 课程对应的问题列表
     */
    private List<Question> questions = new ArrayList<>();

    public Course(String name) {
        this.name = name;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    /**
     * 主题改变方法
     *
     * @param course
     */
    public void produceQuestion(Course course) {
        questions.stream().forEach(question -> {
                    log.info(String.format("%s在%s提出了问题", question.getUserName(), course.getName()));
                    /**
                     * 调用父类Observabel中的setChanged方法，把changed标识设置为true,表示主题对象发生了改变,此时观察者和被观察者之间进行通信
                     */

                    setChanged();

                    /**
                     * 通知观察者
                     */
                    notifyObservers(question);
                }
        );
    }
}