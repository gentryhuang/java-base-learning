package com.design.pattern.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * Article 文章
 *
 * @author shunhua
 * @date 2019-10-04
 */
@Data
@AllArgsConstructor
public class Article implements Serializable {

    private static final long serialVersionUID = -321234774998152556L;

    /**
     * 文章标题
     */
    private String title;
    /**
     * 文章内容
     */
    private String content;
    /**
     * 图片
     */
    private String img;

    /**
     * 把文章保存起来
     * @return
     */
    public ArticleMemento saveToMemento(){
        ArticleMemento articleMemento = new ArticleMemento(this.title,this.content,this.img);
        return articleMemento;
    }

    /**
     * 把保存的文章标题、内容以及图片回退回来
     * @param articleMemento
     */
    public void undoFromMemento(ArticleMemento articleMemento){
        this.title = articleMemento.getTitle();
        this.content = articleMemento.getContent();
        this.img = articleMemento.getImg();
    }

}