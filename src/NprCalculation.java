import java.util.Scanner;
public class NprCalculation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        int nfact=1;
        for (int i = 1;i<=n;i++){
            nfact*=i;
        }
        int nmrfact=1;
        for (int i = 1;i<=n-r;i++){
            nmrfact*=i;
        }
        int NPR=nfact/nmrfact;
        System.out.println(n+"P "+"= "+NPR);
    }
}
