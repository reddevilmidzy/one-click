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

public class Melon implements StreamSite {

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

    public String join(String delimiter, Song[] songs) {
        StringBuilder res = new StringBuilder(songMap.get(songs[0]));
        for (int i = 1; i < songs.length; i++) {
            res.append(delimiter).append(songMap.get(songs[i]));
        }
        return String.valueOf(res);
    }

    public String getPcSeg(Song[] songs) {
        return "melonapp://play?cType=1&menuId=1000002721&cList=" + join(",", songs);
    }

    public String getAndroidSeg(Song[] songs) {
        return "melonapp://play?ctype=1&menuid=1000002721&cid=" + join(",", songs);
    }

    public String getIos(Song[] songs) {
        return "meloniphone://play/?ctype=1&menuid=0&cid=" + join(",", songs);
    }
}
