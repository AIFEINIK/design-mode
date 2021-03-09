package org.example.service;

/**
 * @author ZhangPengFei
 * @discription 枚举类方式实现
 */
public class SingletonInstance2 {

    private enum InstanceEnum {
        INSTANCE;
        private SingletonInstance2 instance2;
        private InstanceEnum() {
            instance2 = new SingletonInstance2();
        }

        public SingletonInstance2 getInstance() {
            return instance2;
        }
    }

    public static SingletonInstance2 getInstance() {
        return InstanceEnum.INSTANCE.getInstance();
    }
}
