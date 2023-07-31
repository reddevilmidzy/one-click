package org.example.site;

import org.example.model.Song;
import org.example.model.StreamSite;

import java.util.HashMap;
import java.util.Map;

import static org.example.model.Song.*;

public class Melon implements StreamSite {
    private final Map<Song, String> songMap;

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

    public Melon() {
        songMap = new HashMap<>(Map.of(BET_ON_ME, "36582680", CAKE, "36582681", NONE_OF_MY_BUSINESS, "36582682",
                BRATTY, "36582683", PSYCHIC_LOVER, "36582684", KILL_SHOT, "36582685"));
        songMap.put(DALLA_DALLA, "31606729");
        songMap.put(ICY, "31955739");
        songMap.put(WANNABE, "32445339");
        songMap.put(NOT_SHY, "32860419");
        songMap.put(MAFIA_IN_THE_MORNING, "33447280");
        songMap.put(LOCO, "33999025");
        songMap.put(SNEAKERS, "35413033");
        songMap.put(CHESHIRE, "35875407");
    }
}
