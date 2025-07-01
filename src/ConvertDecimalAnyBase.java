import java.util.Scanner;
public class ConvertDecimalAnyBase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int b = s.nextInt();
        int f = GaveValueInBase(n,b); //Function that will provide final value
        System.out.println(f);
    }

    private static int GaveValueInBase(int n, int b) {
        int value=0;
        int p=1;
        while(n>0){
            int dig=n%b;  // n is number which input by user modules by base of number user input
            n/=b;          // number will break into pieces
            value+=dig*p;   // value will add dig into power value
            p*=10;          // p will multiply value by 10
        }
        return value;
    }
}
