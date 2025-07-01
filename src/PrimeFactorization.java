import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        java.util.Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int div = 2; div < n;div++){
            while(n%div==0){
                n/=div;
                System.out.print(div+" ");
            }
        }
        if(n != 1){
            System.out.print(n);
        }
    }
}
