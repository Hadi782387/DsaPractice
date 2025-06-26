import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int Num1 = s.nextInt();
        int Num2 = s.nextInt();
        int n1= Num1;
        int n2= Num2;
        while(Num1%Num2!=0){
            int rem = Num1%Num2;
            Num1=Num2;
            Num2=rem;
        }
        System.out.println(Num2);
        int lcm = (n1*n2)/Num2;
        System.out.println(lcm);

    }
}