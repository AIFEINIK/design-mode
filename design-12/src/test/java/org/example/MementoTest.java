package org.example;

import org.example.service.ArticleMemento;
import org.example.service.ArticleMementoManger;
import org.example.service.Editor;
import org.junit.Test;

/**
 * @author Feinik
 * @discription
 * @date 2021/3/7
 * @since 1.0.0
 */
public class MementoTest {

    @Test
    public void execute() {
        System.out.println("开始编辑");
        Editor editor = new Editor("Redis分布式锁这样实现", "通过redis的lua脚本来实现吧");
        System.out.println("编辑前内容：" + editor);

        //保存到备忘录中
        ArticleMementoManger manger = new ArticleMementoManger();
        ArticleMemento articleMemento = editor.buildArticleMemento();
        manger.addArticleMemento(articleMemento);

        System.out.println("第一次编辑");
        editor.setContent("通过 redission开源组件来实现");
        System.out.println("第一次编辑后的内容：" + editor);

        System.out.println("撤销第一次编辑");
        editor.revokeFromMemento(manger.getArticleMemento());
        System.out.println("撤销后内容为：" + editor);
    }
}
