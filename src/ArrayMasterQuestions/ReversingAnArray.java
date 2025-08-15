package ArrayMasterQuestions;

import java.util.Arrays;

public class ReversingAnArray {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,7,9};
        int left = 0;
        int right = numbers.length-1;
        while (left<right){
            int temp = numbers[left];
            numbers[left]= numbers[right];
            numbers[right]=temp;
            left++;right--;
        }
        System.out.print(Arrays.toString(numbers)+" ");
    }
}
