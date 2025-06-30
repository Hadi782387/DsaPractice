import java.util.Scanner;

public class FrequencyOfDigit {
    public static void main(String[] args) {
        java.util.Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = s.nextInt();
        int f = frequencyOfDigit(n,d);
        System.out.println(f);
    }

    private static int frequencyOfDigit(int n, int d) {
        int rv=0;

        while (n>0){
            int dig=n%10;
            n/=10;
            if (dig==d){
              rv++;
            }
        }
        return rv;
    }
}
