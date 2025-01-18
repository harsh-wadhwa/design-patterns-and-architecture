package TrafficLight;

// Each concrete state implements the State interface and defines state-specific behavior.
public class RedState implements State {

    @Override
    public void handleRequest() {
        System.out.println("Red Light - Stop!");
    }

}
