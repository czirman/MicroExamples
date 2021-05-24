package decorators.mydecorator.notifier;

public class SlackDecorator extends SendBaseDecorator{

    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        sendSlack(msg);
    }

    private void sendSlack(String msg){
        System.out.println("Wiadomość |"+msg+"| przesłana SLACKIEM");
    }
}
