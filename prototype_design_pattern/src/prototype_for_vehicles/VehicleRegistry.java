package prototype_for_vehicles;
import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {

    // The mapVehicles is static because it holds shared data for all instances of VehicleRegistry.
    private static Map<String, Vehicle> mapVehicles = new HashMap<>();

    // This block is executed once, and it initializes the map with the two vehicle prototypes (TwoWheelerVehicle and FourWheelerVehicle).
    static {
        mapVehicles.put("TWO", new TwoWheelerVehicle("120", "royal", 100000, false));
        mapVehicles.put("FOUR", new FourWheelerVehicle("120", "bmw", 2000000, true, false));
    }

    public Vehicle getVehicle(String vehicle) throws CloneNotSupportedException {
        return mapVehicles.get(vehicle).clone();
    }

    public void addVehicle(String key, Vehicle vehicle) {
        mapVehicles.put(key, vehicle);
    }

}
