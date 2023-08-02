package org.example.site;

import org.example.model.Song;
import org.example.model.StreamSite;

import java.util.HashMap;
import java.util.Map;

public class Bugs implements StreamSite {
    private final Map<Song, String> songMap;

    public Bugs() {
        songMap = new HashMap<>(Map.of(Song.BET_ON_ME, "6210716", Song.CAKE, "6210717", Song.NONE_OF_MY_BUSINESS, "6209062",
                Song.BRATTY, "6210718", Song.PSYCHIC_LOVER, "6210719", Song.KILL_SHOT, "6210720"));
        songMap.put(Song.DALLA_DALLA, "31454805");
        songMap.put(Song.ICY, "31663145");
        songMap.put(Song.WANNABE, "31852657");
        songMap.put(Song.NOT_SHY, "31994992");
        songMap.put(Song.MAFIA_IN_THE_MORNING, "32222692");
        songMap.put(Song.LOCO, "32342561");
        songMap.put(Song.SNEAKERS, "32593443");
        songMap.put(Song.CHESHIRE, "32714378");
    }

    public static final String MOBILE = "bugs3://app/tracks/lists?title=%EC%A0%84%EC%B2%B4%EB%93%A3%EA%B8%B0&miniplay=Y&track_ids=";
    public static final String PC = "https://music.bugs.co.kr/newPlayer?trackId=";

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