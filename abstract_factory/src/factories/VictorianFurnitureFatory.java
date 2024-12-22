package factories;

import products.Chair;
import products.Sofa;
import products.VictorianChair;
import products.VictorianSofa;

public class VictorianFurnitureFatory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

}
