package WeatherProblem;

// Step 4: Create concrete Subscriber implementations

public class PhoneDisplay implements Observer {
    private String phoneOwner;

    public PhoneDisplay(String phoneOwner) {
        this.phoneOwner = phoneOwner;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Phone display for " + phoneOwner);
        System.out.println("Temperature: " + temperature + "C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Pressure: " + pressure + " hPa\n");
    }



}
