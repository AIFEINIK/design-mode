package org.example.service;

import java.util.Stack;

/**
 * @author Feinik
 * @discription 备忘录管理器
 * @date 2021/3/7
 * @since 1.0.0
 */
public class ArticleMementoManger {

    private Stack<ArticleMemento> mementos = new Stack<>();

    public ArticleMemento getArticleMemento() {
        return mementos.pop();
    }

    public void addArticleMemento(ArticleMemento memento) {
        mementos.push(memento);
    }
}
