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

public class Genie implements StreamSite {

    public static final String ANDROID = "cromegenie://scan/?landing_type=31&landing_target=";
    public static final String IOS = "ktolleh00167://landing/?landing_type=31&landing_target=";
    public static final String PC = "https://www.genie.co.kr/player/shareProcessV2?xgnm=";
    private static final Map<Song, String> songMap;

    static {
        songMap = new HashMap<>();
        songMap.put(UNTOUCHABLE, "");
        songMap.put(BORN_TO_BE, "");
        songMap.put(MR_VAMPIRE, "");
        songMap.put(DYNAMITE, "");
        songMap.put(CROWN_ON_MY_HEAD, "");
        songMap.put(BLOSSOM, "");
        songMap.put(RUN_AWAY, "");
        songMap.put(MINE, "");
        songMap.put(YET_BUT, "");
        songMap.put(ESCALATOR, "");
    }

    @Override
    public String getUrl(String environment, Song[] songs) {
        return environment + join(";", songs);
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
