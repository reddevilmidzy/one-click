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
        songMap.put(UNTOUCHABLE, "37066916");
        songMap.put(BORN_TO_BE, "37066915");
        songMap.put(MR_VAMPIRE, "37066917");
        songMap.put(DYNAMITE, "37066918");
        songMap.put(CROWN_ON_MY_HEAD, "37066919");
        songMap.put(BLOSSOM, "37066920");
        songMap.put(RUN_AWAY, "37066921");
        songMap.put(MINE, "37066922");
        songMap.put(YET_BUT, "37066923");
        songMap.put(ESCALATOR, "37066924");
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
