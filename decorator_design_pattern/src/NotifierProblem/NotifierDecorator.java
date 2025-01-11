package NotifierProblem;

public class NotifierDecorator implements Notifier {

    private Notifier wrappee;

    public NotifierDecorator (Notifier notifier) {
        this.wrappee = notifier;
    }

    @Override
    public void send(String message) {
        System.out.println("type of obj before calling send in notifer decorator" + wrappee.getClass().getName());
        wrappee.send(message);
    }
}
