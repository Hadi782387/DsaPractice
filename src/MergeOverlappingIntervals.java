import java.io.*;
import java.util.*;

public class MergeOverlappingIntervals {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for (int j = 0; j < arr.length; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }
        mergeOverlappingIntervals(arr);
    }

    private static void mergeOverlappingIntervals(int[][] arr) {
        pair[] pairs = new pair[arr.length];
        for (int i = 0; i < arr.length; i++) {
            pairs[i] = new pair(arr[i][0], arr[i][1]);
        }
        Arrays.sort(pairs);

        Stack<pair> st = new Stack<>();
        for (int i = 0; i < pairs.length; i++) {
            if (i == 0) {
                st.push(pairs[i]);
            } else {
                pair top = st.peek();
                if (pairs[i].st > top.et) {
                    st.push(pairs[i]);
                } else {
                    top.et = Math.max(top.et, pairs[i].et);
                }
            }
        }

        // Output the merged intervals
        Stack<pair> rs = new Stack<>();
        while (!st.isEmpty()) {
            rs.push(st.pop());
        }
        while (!rs.isEmpty()) {
            pair p = rs.pop();
            System.out.println(p.st + " " + p.et);
        }
    }

    public static class pair implements Comparable<pair> {
        int st;
        int et;
        pair(int st, int et) {
            this.st = st;
            this.et = et;
        }

        @Override
        public int compareTo(pair other) {
            if (this.st != other.st) return this.st - other.st;
            else return this.et - other.et;
        }
    }
}
