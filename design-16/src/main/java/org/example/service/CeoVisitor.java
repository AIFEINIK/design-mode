package org.example.service;

/**
 * @author ZhangPengFei
 * @discription
 */
public class CeoVisitor implements IVisitor {

    @Override
    public void visit(PmManager pmManager) {
        System.out.println("产品满意度：" + pmManager.getSatisfaction());
    }

    @Override
    public void visit(Programmer programmer) {

    }

    @Override
    public void visit(DevelopmentManager developmentManager) {
        System.out.println("开发进度：" + developmentManager.getProjectRate());
    }
}
