package org.example.service;

/**
 * @author ZhangPengFei
 * @discription 内部类方式实现
 */
public class SingletonInstance1 {

    private static class LazyInstanceHolder {
        private static SingletonInstance1 instance = new SingletonInstance1();
    }

    private SingletonInstance1() {
    }

    public static SingletonInstance1 getInstance() {
        return LazyInstanceHolder.instance;
    }
}
