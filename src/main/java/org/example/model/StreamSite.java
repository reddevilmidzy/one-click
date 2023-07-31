package org.example.model;

public interface StreamSite {
    default String getUrl(String environment, Song[] songs) {
        return null;
    }

    default String getAndroidSeg(Song[] songs) {
        return null;
    }


    default String getIos(Song[] songs) {
        return null;
    }


    default String getPcSeg(Song[] songs) {
        return null;
    }


    default String join(String delimiter, Song[] songs) {
        return "";
    }
}
