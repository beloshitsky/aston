package patterns.bridge.messages;

import patterns.bridge.senders.MessageSender;

public class Email implements Message {
    MessageSender messageSender;

    public Email(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}
