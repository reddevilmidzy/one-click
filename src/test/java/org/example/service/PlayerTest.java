package org.example.service;

import java.util.Arrays;
import org.example.model.Song;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PlayerTest {

    @Test
    @DisplayName("음원 순서 확인")
    void createOrder() {

        Player player = new Player();

        Song[] one = Player.one;
        System.out.println("one = " + Arrays.toString(one));

        Song[] two = Player.two;
        System.out.println("two = " + Arrays.toString(two));

        Song[] three = Player.three;
        System.out.println("three = " + Arrays.toString(three));

        Song[] four = Player.four;
        System.out.println("four = " + Arrays.toString(four));
    }
}