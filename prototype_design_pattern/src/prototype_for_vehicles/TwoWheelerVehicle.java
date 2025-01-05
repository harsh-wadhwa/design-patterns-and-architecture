package prototype_for_vehicles;

public class TwoWheelerVehicle extends Vehicle {

    private boolean isElectric;

    public TwoWheelerVehicle(String engine, String model, long price, boolean isElectric) {
        super(engine, model, price);
        this.isElectric = isElectric;
    }

    @Override
    protected TwoWheelerVehicle clone() throws CloneNotSupportedException {
        return (TwoWheelerVehicle) super.clone();
    }

    @Override
    public String toString() {
        return "TwoWheelerVehicle{" +
                "isElectric=" + isElectric +
                '}';
    }
}
