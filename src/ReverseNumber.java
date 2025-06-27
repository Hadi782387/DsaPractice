
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number:");
        n = sc.nextInt();
        int dig;

        while (n > 0) {
         dig  = n % 10;
            n /= 10;
            System.out.print(dig);
        }

    }
}