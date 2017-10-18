package com.example;

import java.util.Random;


public class MyJokes {
    private static final String[] JOKES = {
            "A computer once beat me at chess, but it was no match for me at kick boxing.",
            " Anton, do you think I am a bad mother? My name is Paul.",
            "What did one ocean say to the other ocean? Nothing, they just waved.",
            "If you owe the bank $100,000, the bank owns you. If you owe the bank $1,000,000,000, you own the bank.",
            "What is the difference between a snowman and a snowwoman? Snowballs",
            "When everything's coming your way, you're in the wrong lane.",
            "Whenever I find the key to success, someone changes the lock.",
            "Patient: Oh doctor, I am just so nervous. This is my first operation. Doctor: me too.",
            "Why did the bee get married? Because he found his honey.",
            "I just let my mind wander, and it didn't come back.",
            "IRS: We've got what it takes to take what you've got.",
            "I asked God for a bike, but I know God works in mysterious ways. So I stole a bike and asked for forgiveness.",
            "If I agreed with you we'd both be wrong.",
            "Microsoft gives you Windows, Linux gives you a home!",
            "I like work: it fascinates me. I can sit and look at it for hours.",
    };

    private static final Random random = new Random();

    public static String getRandomJoke() {
        return JOKES[random.nextInt(JOKES.length)];
    }
}
