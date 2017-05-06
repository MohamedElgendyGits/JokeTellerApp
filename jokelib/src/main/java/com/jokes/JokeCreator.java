package com.jokes;

import java.util.Random;

public class JokeCreator {

    private static final String[] JOKE_LIST = {
            "I went to the zoo the other day. It was empty, except for a single dog",
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
            "What is the difference between a snowman and a snowwoman? - Snowballs.",
            "Dentist: You need a crown. - Patient: Finally someone who understands me ",
            "Coco Chanel once said that you should put perfume on places where you want to be kissed by a man. But hell does that burn!",
            "I heard women love a man in uniform. Can’t wait to start working at McDonalds.",
            "Me and my wife decided that we don't want to have children anymore. So anybody who wants one can leave us their phone number and address and we will bring you one.",
            "It is so cold outside I saw a politician with his hands in his own pockets.",
            "The inventor of AutoCorrect is a stupid mass hole. He can fake right off.",
            "I can’t believe I forgot to go to the gym today. That’s 7 years in a row now."
        };

    public static String getJoke(){
        return JOKE_LIST[new Random().nextInt(JOKE_LIST.length)];
    }
}
