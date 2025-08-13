package ArrayMasterQuestions;

import java.util.Scanner;

// in this question you will get the array check if first,
// or last element is 6 or not if 6 return True otherwise False.
public class FirstLastCheck {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = s.nextInt();
        }
            if (numbers[0]==6 || numbers[n-1]==6) System.out.println("True");
            else System.out.println("false");
    }
}
