package YoutubeVideoProblem;

public class YoutubeService implements VideoService {

    @Override
    public String getVideo(String videoId) {
        System.out.println("Downloading video from youtube " + videoId);
        return "VideoContent" + videoId;
    }

}
