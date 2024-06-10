package se.lexicon;

import java.util.Random;

public class NumberGenerator {
    int max;
    int min;

    public int generateRandomNumberInrange() {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(2500 + 1);
    }

}
