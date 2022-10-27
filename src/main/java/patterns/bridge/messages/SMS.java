package patterns.bridge.messages;

import patterns.bridge.senders.MessageSender;

public class SMS implements Message {
    MessageSender messageSender;

    public SMS(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}
