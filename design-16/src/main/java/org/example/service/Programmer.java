package org.example.service;

import org.apache.commons.lang3.RandomUtils;

/**
 * @author ZhangPengFei
 * @discription 程序员
 */
public class Programmer extends Employee {

    /**
     * 代码行数
     */
    private Integer codeLines;
    /**
     * 代码质量
     */
    private Integer codeQuality;

    public Programmer(String employeeId, String employeeName, Integer codeLines) {
        super(employeeId, employeeName);
        this.codeLines = codeLines;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public Integer getCodeLines() {
        return codeLines;
    }

    public void setCodeLines(Integer codeLines) {
        this.codeLines = codeLines;
    }

    public Integer getCodeQuality() {
        return RandomUtils.nextInt(1, codeLines);
    }
}
