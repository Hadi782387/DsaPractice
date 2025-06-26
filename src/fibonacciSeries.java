import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in) ;
        System.out.println("enter");
        int n = sc.nextInt();
        int a =0;
        int b=1;
        for(int i = 0;i<n;i++){
            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;
        }

    }
}
