package DeviceRemoteProblem;

public class Main {
    public static void main(String[] args) {

        // Yes, the Bridge Design Pattern shifts the relationship from "is-a" to "has-a,"
        // enabling greater flexibility and better scalability.

        // The Key Idea of Bridge Pattern:
        //Abstraction: This represents the high-level functionality or interface that the client interacts with.
        //Implementation: This contains the low-level details of how the abstraction is realized.
        // It defines the actual behavior or functionality that gets executed.

        Device tv = new TV();
        RemoteControl basicRemote = new RemoteControl(tv);
        basicRemote.togglePower();
        basicRemote.volumeUp();
        basicRemote.volumeUp();
        basicRemote.volumeUp();

        Device radio = new Radio();
        AdvancedRemote advancedRemote = new AdvancedRemote(radio);
        advancedRemote.togglePower();
        advancedRemote.mute();

    }
}