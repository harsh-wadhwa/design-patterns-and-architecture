package NotifierProblem;

public class SMSNotifier extends NotifierDecorator {
    public SMSNotifier(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
        super.send(message);
    }

}
