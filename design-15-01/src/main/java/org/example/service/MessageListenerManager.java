package org.example.service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangPengFei
 * @discription 消息监听器管理
 */
public class MessageListenerManager {

    private static List<MessageListener> listeners = new ArrayList<>();

    public static void subScribe(MessageListener listener) {
        listeners.add(listener);
    }

    public static void unScribe(MessageListener listener) {
        listeners.remove(listener);
    }

    public static void notifyAll(Message message) {
        for (MessageListener listener : listeners) {
            listener.pushMsg(message);
        }
    }
}
