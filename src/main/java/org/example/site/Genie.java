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
        songMap.put(UNTOUCHABLE, "104916260");
        songMap.put(BORN_TO_BE, "104916259");
        songMap.put(MR_VAMPIRE, "104916261");
        songMap.put(DYNAMITE, "104916262");
        songMap.put(CROWN_ON_MY_HEAD, "104916263");
        songMap.put(BLOSSOM, "104916264");
        songMap.put(RUN_AWAY, "104916265");
        songMap.put(MINE, "104916266");
        songMap.put(YET_BUT, "104916267");
        songMap.put(ESCALATOR, "104916268");
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
