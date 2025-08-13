package ArrayMasterQuestions;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<arr.length;i++){
            System.out.print("enter elements in array index = "+i +": ");
            arr[i] = s.nextInt();
        }
        int total=0;
        int avg = 0;
        for (int i : arr) total+=i;

        avg= (avg+total)/n;
        System.out.print("The sum of all elements in array is: "+total);
        System.out.print("\nThe average of elements in array is: "+avg);
    }
}
