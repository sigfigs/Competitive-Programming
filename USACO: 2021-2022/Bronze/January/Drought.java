//http://www.usaco.org/index.php?page=viewproblem2&cpid=1181
//Score: 8/15; Time limit error on 9-15

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class Drought {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // read in inputs
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        long[][] hunger = new long[t][];
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            hunger[i] = new long[size];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < size; j++) {
                hunger[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // make everything the min by going through the pairs
        // if everything is equal, break and print out count
        // else, keep decrementing min
        // keep decreasing until min is negative or all equal
        // print count

        for (int testcase = 0; testcase < t; testcase++) {
            long counter = 0;
            long min = hunger[testcase][0];
            for (int i = 0; i < hunger[testcase].length; i++) {
                min = Math.min(min, hunger[testcase][i]);
            }

            for (int i = 0; i < hunger[testcase].length - 1; i++) {
                while (hunger[testcase][i] > min && hunger[testcase][i + 1] > min) {
                    long subtract = Math.min(hunger[testcase][i], hunger[testcase][i + 1]) - min;
                    hunger[testcase][i] -= subtract;
                    hunger[testcase][i + 1] -= subtract;
                    counter = counter + 2 * subtract;
                }
            }

            while (min >= 0 && !allEqual(hunger[testcase])) {
                min--;

                for (int i = 0; i < hunger[testcase].length - 1; i++) {
                    while (hunger[testcase][i] > min && hunger[testcase][i + 1] > min) {
                        long subtract = Math.min(hunger[testcase][i], hunger[testcase][i + 1]) - min;
                        hunger[testcase][i] -= subtract;
                        hunger[testcase][i + 1] -= subtract;
                        counter = counter + 2 * subtract;
                    }
                }

            }
            if (min < 0) {
                System.out.println(-1);
            } else {
                System.out.println(counter);
            }

        }

    }

    public static boolean allEqual(long[] arr) {
        long n = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != n)
                return false;
        }
        return true;
    }

    public static void print2D(long[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
