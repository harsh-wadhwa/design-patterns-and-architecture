package examples.vehicles;

public class Runner {
    public static void main(String[] args) {


        Vehicle vehicle1 = VehicleFactory.getVehicle("Car");
        Vehicle vehicle2 = VehicleFactory.getVehicle("Bike");
//        Vehicle vehicle3 = VehicleFactory.getVehicle("Bus");

        vehicle1.start();
        vehicle2.start();
//        vehicle3.start();


    }
}