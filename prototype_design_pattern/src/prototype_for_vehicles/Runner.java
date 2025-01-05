package prototype_for_vehicles;

public class Runner {
    public static void main(String[] args) {

        try {
            VehicleRegistry registry = new VehicleRegistry();

            Vehicle twoWheeler = registry.getVehicle("TWO");
            twoWheeler.setModel("Royal Enfield Classic 350");
            twoWheeler.setPrice(210000);

            Vehicle fourWheeler = registry.getVehicle("FOUR");
            fourWheeler.setModel("BMW X5");
            fourWheeler.setPrice(9000000);

            System.out.println(twoWheeler);
            System.out.println(fourWheeler);

        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}
