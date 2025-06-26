/*import java.util.Scanner;

public class PrimWithRealWay {
    public static void main(String[] args) {
        java.util.Scanner s = new Scanner(System.in);
        System.out.println("Enter Number to Check:");
        int number = s.nextInt();
        boolean isPrime = true;
        for(int i = 2;i<number;i++) {
            if (number%i == 0) {
                isPrime = false;
            }
        }
            if(isPrime){
                System.out.println("Number is Prime:");
            }else{
                System.out.println("number is not prime");
            }

        }
    }
*/
/*   public class PrimWithRealWay {
    public static void main(String[] args) {
        int num = 7;
        boolean isPrime=true;
        for (int i=2;i<num;i++){
            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println("number is Prime");
        }else{
            System.out.println("number is not prime");
        }
    }
}
*/
 /*public class PrimWithRealWay {
    public static void main(String[] args) {
        int num = 31;                                                        //number input liya
        int i;                                                        //i ko pahle hi declare kiya loop se


        for( i = 2;i<num;i++){
                                                                   //ek loop chalaya 2 se n-1 tak
            if (num%i==0){                                             //ager i se modulas hua to prime nhi hoga
                System.out.println("number isn't prime:");
                break;
                                                                         //break ki wajah se ek baar check mai true aaya to condiditon se bahar
            }
        }
        if (i==num){
            System.out.println("number is prime");
        }
    }
    }
    */
/*
public class PrimWithRealWay {
    public static void main(String[] args) {
    int num=7;
    int count=0;
    for (int i =2;i<num;i++){
        if (num%i==0){
            count++;
            break;
        }
    }
    if (count==0){
        System.out.println("number is prime:");
    }else{
        System.out.println("isn't prime");
    }
    }
}
*/
 //Number of Digit
public class PrimWithRealWay {
    public static void main(String[] args) {
      int num = 234;
      int dig = 0;
      int temp=num;
      while(temp != 0){
          temp/=100;
          dig+=1;
      }
        int div= (int) Math.pow(10,dig-1);
      while (div!=0){
          int q = num/div;
          System.out.println(q);
          num %= div;
          div /= 10;
      }
    }
}