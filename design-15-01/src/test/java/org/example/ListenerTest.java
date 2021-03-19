package org.example;

import org.example.service.Message;
import org.example.service.MessageListenerManager;
import org.example.service.User1Listener;
import org.example.service.User2Listener;
import org.junit.Test;

/**
 * @author ZhangPengFei
 * @discription
 */
public class ListenerTest {

    @Test
    public void execute() {
        User1Listener user1Listener = new User1Listener();
        User2Listener user2Listener = new User2Listener();
        MessageListenerManager.subScribe(user1Listener);
        MessageListenerManager.subScribe(user2Listener);

        Message message = new Message("001", "我发布文章了，开来看呢");
        MessageListenerManager.notifyAll(message);

        MessageListenerManager.unScribe(user1Listener);
        Message message2 = new Message("002", "号外，号外，特朗普败选了");
        MessageListenerManager.notifyAll(message2);
    }
}
