package NotifierProblem;

public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending via email: " + message);
    }

}
