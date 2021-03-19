package org.example.service;

/**
 * @author ZhangPengFei
 * @discription
 */
public class User2Listener implements MessageListener {

    @Override
    public void pushMsg(Message message) {
        System.out.println("User2Listener.pushMsg:" + message);
    }
}
