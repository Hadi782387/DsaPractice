import java.util.Scanner;


public class FindElementInArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n = s.nextInt();
        int [] arr = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        int data=s.nextInt();
        int index=-1;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]==data){
                index = i;
                break;
            }
        }
        System.out.println(index);

    }
}
