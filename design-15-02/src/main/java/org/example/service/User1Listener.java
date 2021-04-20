package org.example.service;

import com.google.common.eventbus.Subscribe;

/**
 * @author ZhangPengFei
 * @discription
 */
public class User1Listener {

    @Subscribe
    public void pushMsg(Message message) {
        System.out.println("User1Listener.pushMsg:" + message);
    }
}
