import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int icj = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(icj+"\t");
                int icjp1 = icj * (i-j)/(j+1);
                icj=icjp1;
            }
            System.out.println();
        }
    }
}