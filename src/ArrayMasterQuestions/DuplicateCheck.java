package ArrayMasterQuestions;
// in that question there is an array with 5 elements check if there is ant duplicate
import java.util.Scanner;

public class DuplicateCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        if (n==0){
            System.out.println("False");
            return;
        }
        for (int i =0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int data=s.nextInt();
        for (int i:arr){
            if (data==arr[i]){
                System.out.println("");
            }
        }
    }
}
