package factories;

import products.Chair;
import products.Sofa;

public interface FurnitureFactory {

    Chair createChair();
    Sofa createSofa();

}
