package patterns.bridge;

import patterns.bridge.messages.Email;
import patterns.bridge.messages.Message;
import patterns.bridge.messages.SMS;
import patterns.bridge.senders.EmailSender;
import patterns.bridge.senders.MessageSender;
import patterns.bridge.senders.SMSSender;

public class Main {
    public static void main(String[] args) {
        MessageSender textMessageSender = new SMSSender();
        Message sms = new SMS(textMessageSender);
        sms.send();

        MessageSender emailMessageSender = new EmailSender();
        Message email = new Email(emailMessageSender);
        email.send();
    }
}
