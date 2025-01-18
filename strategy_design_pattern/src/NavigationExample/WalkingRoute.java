package NavigationExample;

public class WalkingRoute implements RouteStrategy {

    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Building a walking route from " + origin + " to " + destination);
    }
}
