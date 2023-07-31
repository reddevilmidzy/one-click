package org.example.site;

import org.example.model.Song;
import org.example.model.StreamSite;

import java.util.HashMap;
import java.util.Map;

public class Vibe implements StreamSite {
    public static final String ANDROID = "vibe://listen?version=3&trackIds=";
    private final Map<Song, String> songMap;

    @Override
    public String getUrl(String environment, Song[] songs) {
        return environment + join(",", songs);
    }

    public Vibe() {
        songMap = new HashMap<>(Map.of(Song.BET_ON_ME, "65964722", Song.CAKE, "65964723", Song.NONE_OF_MY_BUSINESS, "65964724",
                Song.BRATTY, "65964725", Song.PSYCHIC_LOVER, "65964726", Song.KILL_SHOT, "65964727"));
        songMap.put(Song.DALLA_DALLA, "25534507");
        songMap.put(Song.ICY, "27991807");
        songMap.put(Song.WANNABE, "39913698");
        songMap.put(Song.NOT_SHY, "41527994");
        songMap.put(Song.MAFIA_IN_THE_MORNING, "47525957");
        songMap.put(Song.LOCO, "50767164");
        songMap.put(Song.SNEAKERS, "56048440");
        songMap.put(Song.CHESHIRE, "58860995");
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
