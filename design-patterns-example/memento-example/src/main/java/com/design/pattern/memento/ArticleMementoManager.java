package com.design.pattern.memento;

import java.util.Stack;

/**
 * ArticleMementoManager 文章快照管理者
 *
 * @author shunhua
 * @date 2019-10-04
 */
public class ArticleMementoManager {

    /**
     * 保存 文章快照 的栈，在回退的时候回退的是最新的状态
     */
    private final Stack<ArticleMemento> ARTICLE_MEMENTO_STACK = new Stack<>();

    /**
     * 获取文章快照
     * @return
     */
    public ArticleMemento getMemento(){
        ArticleMemento articleMemento = ARTICLE_MEMENTO_STACK.pop();
        return articleMemento;
    }

    /**
     * 把文章保存为快照
     * @param articleMemento
     */
    public void addMemento(ArticleMemento articleMemento){
        ARTICLE_MEMENTO_STACK.push(articleMemento);
    }



}