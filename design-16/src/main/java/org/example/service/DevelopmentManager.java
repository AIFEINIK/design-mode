package org.example.service;

import org.apache.commons.lang3.RandomUtils;

/**
 * @author ZhangPengFei
 * @discription 开发经理
 */
public class DevelopmentManager extends Employee {

    /**
     * 项目进度
     */
    private String projectRate;

    public DevelopmentManager(String employeeId, String employeeName) {
        super(employeeId, employeeName);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String getProjectRate() {
        return RandomUtils.nextInt(0, 100) + "%";
    }
}
