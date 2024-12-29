package house_and_builder_with_director.house_and_builder;

public interface Builder {
    Builder setFoundation(String foundation);
    Builder setWalls(String walls);
    Builder setRoof(String roof);
    Builder setPaint(String paint);
    Builder setGarden(boolean garden);
    Builder setSwimmingPool(boolean swimmingPool);
    String getFoundation();
    String getWalls();
    String getRoof();
    String getPaint();
    boolean isGarden();
    boolean isSwimmingPool();
    House build(); // Final product

}
