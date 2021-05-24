package decorators.mydecorator.notifier;

import org.junit.Test;

public class MyDecoratorClient {

    @Test
    public void test(){
        String msg = "Jane call to me";
        // te zagnieżdzone new to dekorowanie
        SendBaseDecorator facebook = new SendBaseDecorator(new SlackDecorator(new FacebookDecorator(new MailNotifier())));
        facebook.send(msg);
    }
}
