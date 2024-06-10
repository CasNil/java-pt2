package se.lexicon;

public class App {

    public static void main(String[] args) {


        System.out.println("GenerateRandomNumber: " + NumberGenerator.generateRandomNumber());

        NumberGenerator numberGeneratorObject = new NumberGenerator();
        numberGeneratorObject.min = 1000;
        numberGeneratorObject.max = 2500;
        System.out.println("GenerateRandomNumber between 1000 - 2500: " + numberGeneratorObject.generateRandomNumberInrange());
    }
}