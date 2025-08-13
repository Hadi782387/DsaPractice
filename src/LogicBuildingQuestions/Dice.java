package LogicBuildingQuestions;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
           Random rand = new Random();
           int dice = rand.nextInt(1,7);
        System.out.println(dice);
//        int randomInt = rand.nextInt(); // Any int value
//        int boundedInt = rand.nextInt(100); // 0 to 99
//        double randomDouble = rand.nextDouble(); // 0.0 to 1.0
//        boolean randomBool = rand.nextBoolean(); // true or false
//
//        System.out.println("Random int: " + randomInt);
//        System.out.println("Bounded int: " + boundedInt);
//        System.out.println("Random double: " + randomDouble);
//        System.out.println("Random boolean: " + randomBool);

    }
}
