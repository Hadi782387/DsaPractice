import java.util.Scanner;

public class checkPythagorasTriplets {
    public static void main(String[] args) {
        java.util.Scanner s = new Scanner(System.in) ;
        System.out.println("Enter Three numbers:");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();
        int largeNum;
        int otherTwo;

        if(num1 > num2 && num1>num3){
            largeNum = num1*num1;
            otherTwo = (num2*num2) + (num3*num3);
            if(largeNum==otherTwo){
                System.out.println("pythagoras Triplets:");
            }else{
                System.out.println("non Pythagoras");
            }

        } else if (num2 > num1 && num2>num3) {
            largeNum = num2*num2;
            otherTwo = (num1*num1) + (num3*num3);
            if(largeNum==otherTwo){
                System.out.println("pythagoras Triplets:");
            }else{
                System.out.println("non Pythagoras");
            }
        }
       else{
            largeNum = num3*num3;
            otherTwo = (num1*num1) + (num2*num2);
            if(largeNum==otherTwo){
                System.out.println("pythagoras Triplets:");
            }else{
                System.out.println("non Pythagoras");
            }
        }
    }
}
