package pocketpills;

public class Runner {
    public static void main(String[] args) {
        VolumeCalculatorFactory factory = new VolumeCalculatorFactory();

        String shape = "cylinder";
        double[] dimensions = {3,4};

        VolumeCalculator someCalc = factory.getCalculator(shape);
        System.out.println(someCalc.calculateVolume(dimensions));

    }
}
