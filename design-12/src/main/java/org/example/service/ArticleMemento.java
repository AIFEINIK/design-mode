package org.example.service;

/**
 * @author Feinik
 * @discription 备忘录角色
 * @date 2021/3/7
 * @since 1.0.0
 */
public class ArticleMemento {

    private String title;
    private String content;

    public ArticleMemento(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
