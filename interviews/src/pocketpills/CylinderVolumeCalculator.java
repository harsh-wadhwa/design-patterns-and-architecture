package pocketpills;

public class CylinderVolumeCalculator implements VolumeCalculator {

        @Override
        public double calculateVolume(double[] dimensions) {
            if (dimensions.length != 2) {
                throw new IllegalArgumentException("Cylinder needs radius and height as two dimensions");
            }
            return Math.PI * Math.pow(dimensions[0], 2) * dimensions[1];
        }

}
