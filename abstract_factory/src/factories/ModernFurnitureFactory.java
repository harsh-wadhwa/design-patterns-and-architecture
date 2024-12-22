package factories;

import products.Chair;
import products.ModernChair;
import products.ModernSofa;
import products.Sofa;

public class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

}
