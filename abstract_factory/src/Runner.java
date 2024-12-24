import factories.FurnitureFactory;
import factories.ModernFurnitureFactory;
import factories.VictorianFurnitureFatory;
import products.Chair;
import products.Sofa;

public class Runner {
    public static void main(String[] args) {

        FurnitureFactory factory;   // dynamically select the factory if needed

        // choosing directly for now:
        factory = new VictorianFurnitureFatory();
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();

        chair.sitOn();
        sofa.lieOn();

        // changing:
        factory = new ModernFurnitureFactory();
        chair = factory.createChair();
        sofa = factory.createSofa();

        chair.sitOn();
        sofa.lieOn();

    }
}