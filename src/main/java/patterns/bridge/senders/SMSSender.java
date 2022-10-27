package patterns.bridge.senders;

public class SMSSender implements MessageSender {
    @Override
    public void sendMessage() {
        System.out.println("Sending sms");
    }
}
