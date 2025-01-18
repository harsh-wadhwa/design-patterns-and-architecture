package NavigationExample;

public class CarRoute implements RouteStrategy {

    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Building a route by car from " + origin + " to " + destination);
    }
}
