package org.example;

import org.example.service.CeoVisitor;
import org.example.service.DataView;
import org.example.service.DevelopmentManagerVisitor;
import org.junit.Test;

/**
 * @author ZhangPengFei
 * @discription
 */
public class VisitorTest {

    @Test
    public void execute() {
        DataView dataView = new DataView();
        dataView.show(new CeoVisitor());
        System.out.println("=======================");
        dataView.show(new DevelopmentManagerVisitor());
    }
}
