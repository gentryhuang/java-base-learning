package com.design.pattern.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * ArticleMemento 文章快照,对于快照不需要Setter方法，只用于保存
 *
 * @author shunhua
 * @date 2019-10-04
 */
@Getter
@ToString
@AllArgsConstructor
public class ArticleMemento {
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * 图片
     */
    private String img;

}