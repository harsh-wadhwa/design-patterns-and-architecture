package YoutubeVideoProblem;

import java.util.HashMap;
import java.util.Map;

public class YoutubeProxy implements VideoService {

    private final VideoService realService;
    private final Map<String, String> cache = new HashMap<>();

    public YoutubeProxy(VideoService videoService) {
        this.realService = videoService;
    }

    @Override
    public String getVideo(String videoId) {
        if (cache.containsKey(videoId)) {
            System.out.println("Returning cached video" + videoId);
            return cache.get(videoId);
        }
        System.out.println("Cache miss, Fetching from real service");
        String videoContent = realService.getVideo(videoId);
        cache.put(videoId, videoContent);
        return videoContent;
    }

}
