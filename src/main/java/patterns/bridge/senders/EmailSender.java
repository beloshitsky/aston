package patterns.bridge.senders;

public class EmailSender implements MessageSender {
    @Override
    public void sendMessage() {
        System.out.println("Sending email");
    }
}
