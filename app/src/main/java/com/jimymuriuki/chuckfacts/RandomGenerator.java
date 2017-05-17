package com.jimymuriuki.chuckfacts;


import java.util.ArrayList;
import java.util.Random;

public class RandomGenerator {

    public static String getRandomFact(String[] chuckFacts){

        Random random=new Random();
        String randomFact=chuckFacts[random.nextInt(chuckFacts.length)];
        return randomFact;

    }
    public static int getRandomColor(int[] colors){

        Random random=new Random();
        int randomFact=colors[random.nextInt(colors.length)];
        return randomFact;

    }

}
