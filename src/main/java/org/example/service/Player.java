package org.example.service;

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

import org.example.model.Song;
import org.example.model.StreamSite;
import org.example.site.Bugs;
import org.example.site.Genie;
import org.example.site.Melon;
import org.example.site.Vibe;

public class Player {

    public static final Song[] songs;
    public static final Song[] one;
    public static final Song[] two;
    public static final Song[] three;
    public static final Song[] four;

    static {
        songs = new Song[]{UNTOUCHABLE, BORN_TO_BE, MR_VAMPIRE, DYNAMITE, CROWN_ON_MY_HEAD,
                UNTOUCHABLE, BLOSSOM, RUN_AWAY, MINE, YET_BUT,
                UNTOUCHABLE, ESCALATOR, BORN_TO_BE, CROWN_ON_MY_HEAD,
                UNTOUCHABLE, BLOSSOM, RUN_AWAY, MINE, YET_BUT};

        one = new Song[5];
        two = new Song[5];
        three = new Song[4];
        four = new Song[5];

        System.arraycopy(songs, 0, one, 0, 5);
        System.arraycopy(songs, 5, two, 0, 5);
        System.arraycopy(songs, 10, three, 0, 4);
        System.arraycopy(songs, 14, four, 0, 5);
    }

    public void playMelon() {
        StreamSite melon = new Melon();
        String andOne = melon.getAndroidSeg(one);
        String andTwo = melon.getAndroidSeg(two);
        String andThree = melon.getAndroidSeg(three);
        String andFour = melon.getAndroidSeg(four);

        String pcOne = melon.getPcSeg(one);
        String pcTwo = melon.getPcSeg(two);
        String pcThree = melon.getPcSeg(three);
        String pcFour = melon.getPcSeg(four);

        String iosAll = melon.getIos(songs);

        System.out.println("<p><a href=\"" + andOne + "\">1</a></p>");
        System.out.println("<p><a href=\"" + andTwo + "\">2</a></p>");
        System.out.println("<p><a href=\"" + andThree + "\">3</a></p>");
        System.out.println("<p><a href=\"" + andFour + "\">4</a></p>");

        System.out.println("=================");
        System.out.println("=================");
        System.out.println("iosAll = " + iosAll);

        System.out.println("=================");
        System.out.println("<p><a href=\"" + pcOne + "\">1</a></p>");
        System.out.println("<p><a href=\"" + pcTwo + "\">2</a></p>");
        System.out.println("<p><a href=\"" + pcThree + "\">3</a></p>");
        System.out.println("<p><a href=\"" + pcFour + "\">4</a></p>");

        System.out.println("=================");

    }

    public void playGenie() {
        StreamSite genie = new Genie();
        String and = genie.getUrl(Genie.ANDROID, songs);
        String ios = genie.getUrl(Genie.IOS, songs);
        String pc = genie.getUrl(Genie.PC, songs);

        System.out.println("and = " + and);
        System.out.println("====");
        System.out.println("ios = " + ios);
        System.out.println("====");
        System.out.println("pc = " + pc);
    }

    public void playBugs() {
        StreamSite bugs = new Bugs();
        String andIos = bugs.getUrl(Bugs.MOBILE, songs);
        String pc = bugs.getUrl(Bugs.PC, songs);
        System.out.println("andIos = " + andIos);
        System.out.println("+====");
        System.out.println("pc = " + pc);
    }

    public void playVibe() {
        StreamSite vibe = new Vibe();
        String vibeOne = vibe.getUrl(Vibe.ANDROID, one);
        String vibeTwo = vibe.getUrl(Vibe.ANDROID, two);
        String vibeThree = vibe.getUrl(Vibe.ANDROID, three);
        String vibeFour = vibe.getUrl(Vibe.ANDROID, four);

        System.out.println("<p><a href=\"" + vibeOne + "\">1</a></p>");
        System.out.println("<p><a href=\"" + vibeTwo + "\">2</a></p>");
        System.out.println("<p><a href=\"" + vibeThree + "\">3</a></p>");
        System.out.println("<p><a href=\"" + vibeFour + "\">4</a></p>");

    }
}
