package org.example.service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangPengFei
 * @discription 数据展示
 */
public class DataView {

    private List<Employee> employees = new ArrayList<>();

    public DataView() {
        employees.add(new Programmer("001", "程序员1", 1000));
        employees.add(new DevelopmentManager("005", "开发经理1"));
        employees.add(new Programmer("003", "程序员2", 5600));
        employees.add(new PmManager("004", "产品经理1"));
    }

    public void show(IVisitor visitor) {
        for (Employee employee : employees) {
            employee.accept(visitor);
        }
    }
}
