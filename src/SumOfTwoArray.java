import java.util.Scanner;

public class SumOfTwoArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Step 1: Input of first array
        System.out.print("Enter size of first array: ");
        int n1 = s.nextInt();
        int[] a1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < a1.length; i++) {
            a1[i] = s.nextInt();
        }

        // Step 2: Input of second array
        System.out.print("Enter size of second array: ");
        int n2 = s.nextInt();
        int[] a2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < a2.length; i++) {
            a2[i] = s.nextInt();
        }

        // Step 3: Initialize sum array and pointers
        int[] sum = new int[Math.max(n1, n2)];
        int c = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;

        // Step 4: Add elements from end to start
        while (k >= 0) {
            int d = c;

            if (i >= 0) {
                d += a1[i];
            }

            if (j >= 0) {
                d += a2[j];
            }

            c = d / 10;
            d = d % 10;

            sum[k] = d;

            i--;
            j--;
            k--;
        }

        // Step 5 & 6: Print result
        System.out.print("Sum = ");
        if (c != 0) {
            System.out.println(c + " ");
        }
        for (int val : sum) {
            System.out.println(val + " ");
        }
        System.out.println(); // next line at end
    }
}
