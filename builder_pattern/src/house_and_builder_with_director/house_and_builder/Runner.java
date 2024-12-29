package house_and_builder_with_director.house_and_builder;

public class Runner {
    public static void main(String[] args) {

        Director director = new Director(new VillaBuilder());

        House luxuryHouse = director.constructLuxuryHouse();

        House simpleHouse = director.constructSimpleHouse();

        System.out.println("here's a luxury house: " + luxuryHouse);
        System.out.println("here's a simple house: " + simpleHouse);

    }
}