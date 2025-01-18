package TrafficLight;

// The context class (TrafficLight) will hold a reference to the current state
// and delegate state-specific behavior to the state object.
public class TrafficLight {

    private State currentState;

    public TrafficLight(State initialState) {
        this.currentState = initialState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void changeLight() {
        currentState.handleRequest();
    }



}
