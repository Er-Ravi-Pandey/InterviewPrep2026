package com.DSA.Collections;

import java.util.EnumSet;

public class EnumSetExample {

    enum Game { CRICKET, HOCKEY, TENNIS };


    public  static void main(String[] args) {
     EnumSet<Game> games, selected;
             games= EnumSet.allOf(Game.class);

             selected=EnumSet.of(Game.CRICKET, Game.HOCKEY);
        System.out.println("Games: " + games + "\n" + "\n" + "Selected: " + selected);
    }
}
