package YoutubeVideoProblem;

public class Main {
    public static void main(String[] args) {

        VideoService proxy = new YoutubeProxy(new YoutubeService());

        System.out.println(proxy.getVideo("ONAconERsSaA"));
        System.out.println(proxy.getVideo("ONAconERsSaA"));


    }
}