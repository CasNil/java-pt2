package se.lexicon;

public class StringExercise {
    public static void main(String[] args) {


        String msg1 = "Ok this is not as long!";
        System.out.print(msg1.substring(11, 22));
        System.out.println("----------------------");


        String msg2 = "CAPS EQUALS SCREAMING";
        msg2 = msg2.toUpperCase();
        System.out.println(msg2);

        String msg3 = "Java is the worst programming language! ";
        System.out.println(msg3.replace("worst", "best"));

        String msg4 = "\tJ\ta\tv\ta\t";
        System.out.println(msg4.trim());


        String int1 = String.valueOf(Integer.parseInt("20"));
        System.out.println(int1 + "20");


        /*
        String msg5 = "Oil and Water";
        System.out.println(msg5.substring(0, 3));
        System.out.println(msg5.substring(8, 13));
        */

        String[] arr1 = {"Oil", "Water"};
        for (String i : arr1) {
            System.out.println(i + " ");
        }
        System.out.println("-------------------------");

        String[] arr2 = {"Carl, Susie, Fredrick, Bob, Erik "};
        for (String u : arr2) {
            System.out.print(u + " ");
        }
    }
}
