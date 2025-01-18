package NavigationExample;

public class Main {
    public static void main(String[] args) {

        RoutePlanner routePlanner = new RoutePlanner();

        String origin = "Central Park";
        String destination = "Times Square";

        routePlanner.setRouteStrategy(new CarRoute());
        routePlanner.planRoute(origin, destination);

        routePlanner.setRouteStrategy(new WalkingRoute());
        routePlanner.planRoute(origin, destination);

    }
}