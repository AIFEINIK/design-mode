package org.example.service;

/**
 * @author ZhangPengFei
 * @discription 抽象的雇员类
 */
public abstract class Employee {
    private String employeeId;
    private String employeeName;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     * 访问方法
     * @param visitor
     */
    public abstract void accept(IVisitor visitor);
}
