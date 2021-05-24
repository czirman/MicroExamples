package decorators.mydecorator.notifier;

public class MailNotifier implements Notifier {

    @Override
    public void send(String msg) {
        System.out.println("Wiadomość |"+msg+"| przesłana MAILEM");
    }
}
