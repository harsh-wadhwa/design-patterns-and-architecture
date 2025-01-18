package TrafficLight;

public class GreenState implements State {

    @Override
    public void handleRequest() {
        System.out.println("Green Light - Go!");
    }

}
