package house_and_builder_nested_builder;

public class Runner {
    public static void main(String[] args) {

        House luxuryHouse = new House.HouseBuilder()
                .setFoundation("concrete")
                .setRoof("Tile")
                .setWalls("brick")
                .setPaint("White")
                .setGarden(true)
                .setSwimmingPool(true)
                .build();

        House simpleHouse = new House.HouseBuilder()
                .setFoundation("wood")
                .setRoof("wood")
                .setWalls("wooden")
                .setPaint("brown")
                .build();


        System.out.println("here's a luxury house: " + luxuryHouse);
        System.out.println("here's a simple house: " + simpleHouse);

    }
}