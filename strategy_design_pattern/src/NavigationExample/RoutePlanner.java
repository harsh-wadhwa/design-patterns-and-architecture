package NavigationExample;

public class RoutePlanner {

    private RouteStrategy routeStrategy;

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void planRoute(String origin, String destination) {
        routeStrategy.buildRoute(origin, destination);
    }

}
