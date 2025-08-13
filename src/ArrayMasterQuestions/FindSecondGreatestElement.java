package ArrayMasterQuestions;

public class FindSecondGreatestElement {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int max=arr[0];
        int secondMax = arr[0];
        for (int i : arr){
            if (i>max) {
                secondMax = max;
                max = i;
            }else if (i>secondMax && i!=max){
                secondMax = i;
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}
