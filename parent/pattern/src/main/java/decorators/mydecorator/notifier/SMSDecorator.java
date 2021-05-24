package decorators.mydecorator.notifier;

public class SMSDecorator extends SendBaseDecorator{

    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        sendSMS(msg);
    }

    private void sendSMS(String msg){
        System.out.println("Wiadomość |"+msg+"| przesłana SMS");
    }
}
