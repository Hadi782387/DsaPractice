import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int b=s.nextInt();
        int n1= s.nextInt();
        int n2= s.nextInt();
        int f = getSub(b,n1,n2);
        System.out.println(f);
    }

    private static int getSub(int b, int n1, int n2) {
        int rv=0;
        int p =1;
        int c=0;
        while(n2>0){
            int d1 = n1%10;
            n1/=10;
            int d2 = n2%10;
            n2/=10;



            int d;
            d2+=c;

            if(d2>=d1){
                 c=0;
                 d=d2-d1;
            }else{
                c=-1;
                d=d2+b-d1;
            }
            rv+=d*p;
            p*=10;

        }
        return rv;
    }
}
