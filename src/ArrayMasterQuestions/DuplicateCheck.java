package ArrayMasterQuestions;

import java.util.Scanner;

public class DuplicateCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        if (n == 0) {
            System.out.println("False");
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        boolean hasDuplicate = false;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicate = true;
                    break;
                }
            }
            if (hasDuplicate) break;
        }

        System.out.println(hasDuplicate ? "True" : "False");
    }
}