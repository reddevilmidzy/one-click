package org.example.site;

import static org.example.model.Song.BLOSSOM;
import static org.example.model.Song.BORN_TO_BE;
import static org.example.model.Song.CROWN_ON_MY_HEAD;
import static org.example.model.Song.DYNAMITE;
import static org.example.model.Song.ESCALATOR;
import static org.example.model.Song.MINE;
import static org.example.model.Song.MR_VAMPIRE;
import static org.example.model.Song.RUN_AWAY;
import static org.example.model.Song.UNTOUCHABLE;
import static org.example.model.Song.YET_BUT;

import java.util.HashMap;
import java.util.Map;
import org.example.model.Song;
import org.example.model.StreamSite;

public class Vibe implements StreamSite {
    public static final String ANDROID = "vibe://listen?version=3&trackIds=";
    private static final Map<Song, String> songMap;

    static {
        songMap = new HashMap<>();
        songMap.put(UNTOUCHABLE, "81984905");
        songMap.put(BORN_TO_BE, "81984904");
        songMap.put(MR_VAMPIRE, "81984906");
        songMap.put(DYNAMITE, "81984907");
        songMap.put(CROWN_ON_MY_HEAD, "81984908");
        songMap.put(BLOSSOM, "81984909");
        songMap.put(RUN_AWAY, "81984910");
        songMap.put(MINE, "81984911");
        songMap.put(YET_BUT, "81984912");
        songMap.put(ESCALATOR, "81984913");
    }

    @Override
    public String getUrl(String environment, Song[] songs) {
        return environment + join(",", songs);
    }


    @Override
    public String join(String delimiter, Song[] songs) {
        StringBuilder res = new StringBuilder(songMap.get(songs[0]));
        for (int i = 1; i < songs.length; i++) {
            res.append(delimiter).append(songMap.get(songs[i]));
        }
        return String.valueOf(res);
    }
}
