package org.example.service;

import org.apache.commons.lang3.RandomUtils;

/**
 * @author ZhangPengFei
 * @discription 产品经理
 */
public class PmManager extends Employee {

    /**
     * 满意度
     */
    private Integer satisfaction;

    public PmManager(String employeeId, String employeeName) {
        super(employeeId, employeeName);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public Integer getSatisfaction() {
        return RandomUtils.nextInt(50, 100);
    }
}
