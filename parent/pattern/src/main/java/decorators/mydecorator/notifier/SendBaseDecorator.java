package decorators.mydecorator.notifier;

public class SendBaseDecorator implements  Notifier{
    private Notifier wrappee;

    public SendBaseDecorator(Notifier notifier) {
        this.wrappee = notifier;
    }

    @Override
    public void send(String msg) {
        wrappee.send(msg);
    }
}
