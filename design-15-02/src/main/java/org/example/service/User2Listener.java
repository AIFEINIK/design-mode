package org.example.service;

import com.google.common.eventbus.Subscribe;

/**
 * @author ZhangPengFei
 * @discription
 */
public class User2Listener {

    @Subscribe
    public void pushMsg(Message message) {
        System.out.println("User2Listener.pushMsg:" + message);
    }
}
