package NotifierProblem;

public class Runner {
    public static void main(String[] args) {

        // Base Notifier: Email
        Notifier notifier = new EmailNotifier();

        // Add SMS notification
        notifier = new SMSNotifier(notifier);

        // Add Slack notification
        notifier = new SlackNotifier(notifier);

        notifier.send("Your order has been shipped");

    }
}