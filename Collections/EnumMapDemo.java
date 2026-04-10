package com.DSA.Collections;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        //array of size same as enum
        //[_,"Gym",_,_,_,_,_]
        //no hashing
        //ordinal/index is used
        //Faster than HashMap
        //Memory Efficient
        Map<Day, String> map = new EnumMap<>(Day.class); //EnumMap is a subclass of HashMap
        map.put(Day.MONDAY, "Gym");
        map.put(Day.TUESDAY, "Walk");
        System.out.println(map.get(Day.MONDAY));

    }

    enum Day{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY};
}
