import java.util.Scanner;

public class DifferenceOfTwoArray {
    public static void main(String[] args) {

        // first array initialisation and  input.
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int[] a1= new int[n1];
        for (int i = 0; i< a1.length;i++){
            a1[i]=s.nextInt();
        }

        // second array initialisation and  input.

        int n2 = s.nextInt();
        int[] a2= new int[n2];
        for (int i = 0; i< a2.length;i++){
            a2[i]=s.nextInt();
        }

        // initialisation of third array for difference
        int[] diff = new int[n2];

        // initialisation of carry
        int c = 0;

        // Storing arrays in i,j,k
        int i = a1.length-1;
        int j = a2.length-1;
        int k = diff.length-1;
        while(k>=0){
            int d=0;

            // initialisation of alv for a1[i] and 0.
            int alv= (i>=0?a1[i]:0);

            // a2[]+carry is greater than alv then subtract
            if (a2[j]+c>=alv){
               d = a2[j]+c - alv;
               c=0;
            }else{
                // adding borrow
                d=a2[j]+10-alv;
                c=-1;
            }
            diff[k]=d;
            i--;j--;k--;
        }
        int idx=0;

        // while diff is greater than idx
        while (idx<diff.length){

            if (diff[idx]==0){
                idx++;
            }else {
                break;
            }
        }
        // while diff is greater than idx
        while (idx<diff.length) {
            // print sum and increment of idx
            System.out.println(diff[idx]);
            idx++;
        }
    }
}

