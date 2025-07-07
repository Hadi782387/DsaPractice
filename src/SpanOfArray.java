import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];              // step 1: creating a array size of n

        for (int i =0;i<arr.length;i++){       // step 2: taking input elements of array
            arr[i]=s.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i =0;i<arr.length;i++){
            if (arr[i]>max) {                //step 3 if i is greater than max
                max=arr[i];
            }
            if (arr[i]<min){                 //step 4: if i is smaller than min
                min=arr[i];
            }

        }
        int span = max-min;                  //step 5; formula of span
        System.out.println(span);
    }
}

