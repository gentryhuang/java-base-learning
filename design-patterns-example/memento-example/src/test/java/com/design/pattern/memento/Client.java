package com.design.pattern.memento;

import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-10-04
 */
public class Client {

    @Test
    public void test(){
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        System.out.println("//------------------------------文章保存到暂存------------------------------/");

        // 创建文章对象
        Article article = new Article("论设计模式的重要性","设计模式是基本功，一定要学好","http://img.png");
        // 组装Article 快照
        ArticleMemento articleMemento = article.saveToMemento();
        // 保存快照
        articleMementoManager.addMemento(articleMemento);

        System.out.println("文章完整信息：" + article);

        System.out.println("//-------------------------------文章修改然后保存到暂存-------------------------/");
        article.setTitle("论算法学习的重要性");
        article.setContent("算法是基本功，一定要学好");
        article.setImg("http://img.jpg");
        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        System.out.println("//------------------------------继续写文章，但发现写错了需要回退----------------/");
        article.setTitle("标题换一个");


        System.out.println("//---------------------------------暂存回退-------------------------------/");
        System.out.println("回退第一次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退第二次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("文章第一次保存的信息：" + article);



    }
}