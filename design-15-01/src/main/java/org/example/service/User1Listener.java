package org.example.service;

/**
 * @author ZhangPengFei
 * @discription
 */
public class User1Listener implements MessageListener {

    @Override
    public void pushMsg(Message message) {
        System.out.println("User1Listener.pushMsg:" + message);
    }
}
