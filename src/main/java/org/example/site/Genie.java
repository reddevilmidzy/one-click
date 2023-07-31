package org.example.site;

import org.example.model.Song;
import org.example.model.StreamSite;

import java.util.HashMap;
import java.util.Map;

public class Genie implements StreamSite {
    private final Map<Song, String> songMap;

    public static final String ANDROID = "cromegenie://scan/?landing_type=31&landing_target=";
    public static final String IOS = "ktolleh00167://landing/?landing_type=31&landing_target=";
    public static final String PC = "https://www.genie.co.kr/player/shareProcessV2?xgnm=";

    @Override
    public String getUrl(String environment, Song[] songs) {
        return environment + join(";", songs);
    }

    public String join(String delimiter, Song[] songs) {
        StringBuilder res = new StringBuilder(songMap.get(songs[0]));
        for (int i = 1; i < songs.length; i++) {
            res.append(delimiter).append(songMap.get(songs[i]));
        }
        return String.valueOf(res);
    }

    public Genie() {
        songMap = new HashMap<>(Map.of(Song.BET_ON_ME, "102507879", Song.CAKE, "102507880", Song.NONE_OF_MY_BUSINESS, "102507881",
                Song.BRATTY, "102507882", Song.PSYCHIC_LOVER, "102507883", Song.KILL_SHOT, "102507884"));
        songMap.put(Song.DALLA_DALLA, "88607738");
        songMap.put(Song.ICY, "89258787");
        songMap.put(Song.WANNABE, "89952547");
        songMap.put(Song.NOT_SHY, "80679336");
        songMap.put(Song.MAFIA_IN_THE_MORNING, "93154014");
        songMap.put(Song.LOCO, "94395661");
        songMap.put(Song.SNEAKERS, "97480729");
        songMap.put(Song.CHESHIRE, "99236070");
    }
}
