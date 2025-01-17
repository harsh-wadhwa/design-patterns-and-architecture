package WeatherProblem;

// Step 2: Define the Subject (Publisher) interface
public interface Subject {

    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();

}
