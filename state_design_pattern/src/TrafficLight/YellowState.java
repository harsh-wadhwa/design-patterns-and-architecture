package TrafficLight;

public class YellowState implements State {

    @Override
    public void handleRequest() {
        System.out.println("Yellow Light - Get Ready!");
    }

}
