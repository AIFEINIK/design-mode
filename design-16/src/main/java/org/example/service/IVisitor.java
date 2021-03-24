package org.example.service;

/**
 * @author ZhangPengFei
 * @discription 数据访问接口
 */
public interface IVisitor {

    /**
     * 需要访问产品经理数据
     * @param pmManager
     */
    void visit(PmManager pmManager);

    /**
     * 需要访问程序员数据
     * @param programmer
     */
    void visit(Programmer programmer);

    /**
     * 需要访问开发经理数据
     * @param developmentManager
     */
    void visit(DevelopmentManager developmentManager);
}
