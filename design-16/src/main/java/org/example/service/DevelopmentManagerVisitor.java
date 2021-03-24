package org.example.service;

/**
 * @author ZhangPengFei
 * @discription
 */
public class DevelopmentManagerVisitor implements IVisitor {

    @Override
    public void visit(PmManager pmManager) {

    }

    @Override
    public void visit(Programmer programmer) {
        System.out.println("姓名："  + programmer.getEmployeeName() + " 代码质量：" + programmer.getCodeQuality());
    }

    @Override
    public void visit(DevelopmentManager developmentManager) {

    }
}
