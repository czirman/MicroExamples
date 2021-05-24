package decorators.mydecorator.notifier;

public class FacebookDecorator extends SendBaseDecorator {

    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String msg) {
        super.send(msg);
        sendFacebook(msg);
    }

    private void sendFacebook(String msg){
        System.out.println("Wiadomość |"+msg+"| przesłana FACEBOOKIEM");
    }
}
