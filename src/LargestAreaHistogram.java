import java.io.*;
import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Step 1: Take input for number of bars in the histogram
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        // Step 2: Take input for height of each bar
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // Step 3: Find Next Smaller Element to the Right (Right Boundary)
        int[] rb = new int[arr.length]; // rb[i] stores the index of next smaller element to the right of arr[i]
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            // Pop until a smaller element is found or stack becomes empty
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            // If no smaller element, then right boundary is n (out of array)
            if (st.isEmpty()) {
                rb[i] = arr.length;
            } else {
                rb[i] = st.peek();
            }

            // Push current index to stack
            st.push(i);
        }

        // Step 4: Find Previous Smaller Element to the Left (Left Boundary)
        int[] lb = new int[arr.length]; // lb[i] stores the index of previous smaller element to the left of arr[i]
        st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {

            // Pop until a smaller element is found or stack becomes empty
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            // If no smaller element, then left boundary is -1 else st.peek
            if (st.isEmpty()) {
                lb[i] = -1;
            } else {
                lb[i] = st.peek();
            }

            // Push current index to stack
            st.push(i);
        }

        // Step 5: Calculate the maximum area of histogram
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = rb[i] - lb[i] - 1; // Width = right index - left index - 1
            int area = arr[i] * width;     // Area = height * width
            if (area > maxArea) {
                maxArea = area;
            }
        }

        // Step 6: Print the result
        System.out.println(maxArea);
    }
}
