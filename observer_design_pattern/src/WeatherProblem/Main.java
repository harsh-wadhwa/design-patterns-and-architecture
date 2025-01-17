package WeatherProblem;

public class Main {
    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneDisplay1 = new PhoneDisplay("Alice");
        PhoneDisplay phoneDisplay2 = new PhoneDisplay("Bob");

        weatherStation.subscribe(phoneDisplay1);
        weatherStation.subscribe(phoneDisplay2);

        System.out.println("Updating Weather Data (Round 1):");
        weatherStation.setWeatherData(25.0f, 65.0f, 1013.0f);

        weatherStation.unsubscribe(phoneDisplay1);
        System.out.println("\nUpdating Weather Data (Round 2):");
        weatherStation.setWeatherData(28.0f, 70.0f, 1010.0f);

    }
}