import java.util.Scanner;
public class ConvertAnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int b = s.nextInt();
        int f = GaveValueInBase(n, b); //Function that will provide final value
        System.out.println(f);
    }
    public static int GaveValueInBase(int n,int b){
        int v = 0;
        int p = 1;
        while(n > 0){
            int dig = n % 10;
            n /= 10;
            v += dig*p;
            p *= b;
        }
        return v;
    }
}