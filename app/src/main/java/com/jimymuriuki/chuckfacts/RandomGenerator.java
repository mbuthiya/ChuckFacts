package com.jimymuriuki.chuckfacts;


import java.util.Random;

public class RandomGenerator {

    public static String getRandomFact(String[] chuckFacts){
        Random random=new Random();

        String randomFact=chuckFacts[random.nextInt(chuckFacts.length)];
        return randomFact;

    }

}
