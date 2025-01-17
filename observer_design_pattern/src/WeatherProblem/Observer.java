package WeatherProblem;


// Step 1: Define the Observer (Subscriber) interface
public interface Observer {

    void update(float temperature, float humidity, float pressure) ;

}
