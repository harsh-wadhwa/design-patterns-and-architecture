package VideoConversionProblem;

public class Main {
    public static void main(String[] args) {
        VideoConverter converter = new VideoConverter();


        // Converting the video file using a simplified interface
        String convertedFile = converter.convert("funny-cats-video.ogg", "mp4");
        System.out.println("Converted file: " + convertedFile);

    }
}