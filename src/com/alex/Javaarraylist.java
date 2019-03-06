package com.alex;

import java.util.ArrayList;

public class Javaarraylist {
    public static void main(String[] args) {
        ArrayList<String> names =new ArrayList<>();
        names.add("john");
        names.add("james");
        names.add("janet");
        names.add("joy");
        names.add("mary");
        names.add("peter");
        names.add("joan");

        System.out.println(names.get(3));
        System.out.println(names.get(5));


        names.remove(2);
        System.out.println(names.size());

        names.clear();
        System.out.println(names.size());

        Functions.areacircle(21);
    }
}
