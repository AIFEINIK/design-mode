package org.example.service;

/**
 * @author ZhangPengFei
 * @discription 抽象消息监听器
 */
public interface MessageListener {

    /**
     * 消息推送
     * @param message
     */
    void pushMsg(Message message);
}
