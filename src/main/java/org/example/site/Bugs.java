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

public class Bugs implements StreamSite {

    public static final String MOBILE = "bugs3://app/tracks/lists?title=%EC%A0%84%EC%B2%B4%EB%93%A3%EA%B8%B0&miniplay=Y&track_ids=";
    public static final String PC = "https://music.bugs.co.kr/newPlayer?trackId=";
    private static final Map<Song, String> songMap;

    static {
        songMap = new HashMap<>();
        songMap.put(UNTOUCHABLE, "6228690");
        songMap.put(BORN_TO_BE, "6226428");
        songMap.put(MR_VAMPIRE, "6227821");
        songMap.put(DYNAMITE, "6228691");
        songMap.put(CROWN_ON_MY_HEAD, "6226906");
        songMap.put(BLOSSOM, "6228692");
        songMap.put(RUN_AWAY, "6227170");
        songMap.put(MINE, "6227232");
        songMap.put(YET_BUT, "6227513");
        songMap.put(ESCALATOR, "6228693");
    }


    @Override
    public String getUrl(String environment, Song[] songs) {
        String delimiter;
        if (environment.equals(MOBILE)) {
            delimiter = "|";
        } else {
            delimiter = ",";
        }
        return environment + join(delimiter, songs);
    }

    public String join(String delimiter, Song[] songs) {
        StringBuilder res = new StringBuilder(songMap.get(songs[0]));
        for (int i = 1; i < songs.length; i++) {
            res.append(delimiter).append(songMap.get(songs[i]));
        }
        return String.valueOf(res);
    }
}