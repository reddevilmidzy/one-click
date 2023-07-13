package org.example.site;

import org.example.model.Song;
import org.example.model.StreamSite;

import java.util.HashMap;
import java.util.Map;

public class Vibe implements StreamSite {

    private Map<Song, String> song = new HashMap<>();

    public Vibe() {
        song.put(Song.DALLA_DALLA, "");
        song.put(Song.ICY, "");
        song.put(Song.WANNABE, "");
        song.put(Song.NOT_SHY, "");
        song.put(Song.MAFIA_IN_THE_MORNING, "");
        song.put(Song.LOCO, "");
        song.put(Song.SNEAKERS, "");
        song.put(Song.CHESHIRE, "");
        song.put(Song.BET_ON_ME, "");
        song.put(Song.CAKE, "");
        song.put(Song.NONE_OF_MY_BUSINESS, "");
        song.put(Song.BRATTY, "");
        song.put(Song.PSYCHIC_LOVER, "");
        song.put(Song.KILL_SHOT, "");
    }

    @Override
    public void printLink() {
    }
}
