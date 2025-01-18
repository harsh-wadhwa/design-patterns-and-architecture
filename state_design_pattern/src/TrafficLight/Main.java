package TrafficLight;

public class Main {
    public static void main(String[] args) {
        State red = new RedState();
        State yellow = new YellowState();
        State green = new GreenState();

        // Create the TrafficLight context with an initial state
        TrafficLight trafficLight = new TrafficLight(red);

        System.out.println("Current light:");
        trafficLight.changeLight();      // Output: Red light - Stop!

        trafficLight.setState(yellow);
        System.out.println("Current light: ");
        trafficLight.changeLight();      // Output: Yellow light - Get ready!

        trafficLight.setState(green);
        System.out.println("Current light: ");
        trafficLight.changeLight();      // Output: Green light - Go!

    }
}
