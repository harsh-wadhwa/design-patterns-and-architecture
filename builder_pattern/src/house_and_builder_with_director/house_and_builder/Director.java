package house_and_builder_with_director.house_and_builder;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public House constructLuxuryHouse() {
        return builder
                .setFoundation("Concrete")
                .setWalls("Brick")
                .setRoof("Tile")
                .setPaint("White")
                .setGarden(true)
                .setSwimmingPool(true)
                .build();
    }

    public House constructSimpleHouse() {
        return builder
                .setFoundation("Wood")
                .setWalls("Wooden")
                .setRoof("Shingles")
                .setPaint("Brown")
                .setGarden(false)
                .setSwimmingPool(false)
                .build();
    }

}
