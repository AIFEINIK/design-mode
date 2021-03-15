package org.example.service;

/**
 * @author Feinik
 * @discription 文档编辑器对象
 * @date 2021/3/7
 * @since 1.0.0
 */
public class Editor {

    private String title;
    private String content;

    public Editor() {
    }

    public Editor(String title, String content) {
        this.title = title;
        this.content = content;
    }

    /**
     * 构建备忘录对象
     * @return
     */
    public ArticleMemento buildArticleMemento() {
        return new ArticleMemento(this.getTitle(), this.getContent());
    }

    /**
     * 撤销，回到上一步编辑内容，从备忘录中恢复
     * @param memento
     */
    public void revokeFromMemento(ArticleMemento memento) {
        this.title = memento.getTitle();
        this.content = memento.getContent();
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

    @Override
    public String toString() {
        return "Editor{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
