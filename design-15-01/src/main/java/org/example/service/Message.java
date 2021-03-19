package org.example.service;

/**
 * @author ZhangPengFei
 * @discription
 */
public class Message {

    private String msgId;
    private String msgContent;

    public Message() {
    }

    public Message(String msgId, String msgContent) {
        this.msgId = msgId;
        this.msgContent = msgContent;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    @Override
    public String toString() {
        return "Message{" +
                "msgId='" + msgId + '\'' +
                ", msgContent='" + msgContent + '\'' +
                '}';
    }
}
