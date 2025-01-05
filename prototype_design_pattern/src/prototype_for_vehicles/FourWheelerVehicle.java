package prototype_for_vehicles;

public class FourWheelerVehicle extends Vehicle {

    private boolean automatic;
    private boolean isDiesel;

    public FourWheelerVehicle(String engine, String model, long price, boolean automatic, boolean isDiesel) {
        super(engine, model, price);
        this.automatic = automatic;
        this.isDiesel = isDiesel;
    }

    protected FourWheelerVehicle clone() throws CloneNotSupportedException {
        return (FourWheelerVehicle) super.clone();
    }

    @Override
    public String toString() {
        return "FourWheelerVehicle{" +
                "automatic=" + automatic +
                ", isDiesel=" + isDiesel +
                '}';
    }
}
