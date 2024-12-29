package house_and_builder_with_director.house_and_builder;

public class House {

    private String foundation;
    private String walls;
    private String roof;
    private String paint;
    private boolean garden;
    private boolean swimmingPool;

    // package-private (default) constructor
    House(Builder builder) {
        this.foundation = builder.getFoundation();
        this.walls = builder.getWalls();
        this.roof = builder.getRoof();
        this.paint = builder.getPaint();
        this.garden = builder.isGarden();
        this.swimmingPool = builder.isSwimmingPool();
        // validations if needed:
        if (builder.getWalls().isEmpty()){
            throw new IllegalArgumentException("Must specify walls");
        }
    }

    // make getters if needed for house class. do not make setters (not recommended)

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", walls='" + walls + '\'' +
                ", roof='" + roof + '\'' +
                ", paint='" + paint + '\'' +
                ", garden=" + garden +
                ", swimmingPool=" + swimmingPool +
                '}';
    }


}
