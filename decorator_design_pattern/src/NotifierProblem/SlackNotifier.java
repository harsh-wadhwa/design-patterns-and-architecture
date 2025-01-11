package NotifierProblem;

public class SlackNotifier extends NotifierDecorator {
    public SlackNotifier(Notifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        System.out.println("Sending Slack message: " + message);
        super.send(message);
    }

}
