package VideoConversionProblem;

public class BitrateReader {

    public static String read(String filename, String codec) {
        System.out.println("Reading bitrate of " + filename + " using " + codec);
        return "buffer";
    }

    public static String convert(String buffer, Object codec) {
        System.out.println("Converting " + buffer + " to target format." );
        return "convertedFile";
    }

}
