import java.util.Scanner;
public class TriangleByNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = s.nextInt();
        int on = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(on + "\t");
                on += 1;
            }

            System.out.println();
        }
        }
}
