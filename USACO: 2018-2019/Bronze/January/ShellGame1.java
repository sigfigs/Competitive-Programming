//http://www.usaco.org/index.php?page=viewproblem2&cpid=891

import java.util.*;
import java.io.*;

public class ShellGame1 {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader("shell.in"));
        PrintWriter outfile = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));

        StringTokenizer st = new StringTokenizer(file.readLine());
        int swaps = Integer.parseInt(st.nextToken());
        int[] a = new int[swaps];
        int[] b = new int[swaps];
        int[] guess = new int[swaps];
        boolean[] pebble = new boolean[3];

        for (int i = 0; i < swaps; i++) {
            st = new StringTokenizer(file.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
            guess[i] = Integer.parseInt(st.nextToken());
        }

        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        pebble[0] = true;
        for (int i = 0; i < swaps; i++) {
            boolean temp = pebble[a[i] - 1];
            pebble[a[i] - 1] = pebble[b[i] - 1];
            pebble[b[i] - 1] = temp;
            if (pebble[guess[i] - 1] == true) {
                score1++;
            }
        }

        pebble[1] = true;
        pebble[0] = false;
        pebble[2] = false;

        for (int i = 0; i < swaps; i++) {
            boolean temp = pebble[a[i] - 1];
            pebble[a[i] - 1] = pebble[b[i] - 1];
            pebble[b[i] - 1] = temp;
            if (pebble[guess[i] - 1] == true) {
                score2++;
            }
        }

        pebble[2] = true;
        pebble[0] = false;
        pebble[1] = false;

        for (int i = 0; i < swaps; i++) {
            boolean temp = pebble[a[i] - 1];
            pebble[a[i] - 1] = pebble[b[i] - 1];
            pebble[b[i] - 1] = temp;
            if (pebble[guess[i] - 1] == true) {
                score3++;

            }
        }

        int maxScore = Math.max(score1, Math.max(score2, score3));
        System.out.println(score1);
        System.out.println(score2);
        System.out.println(score3);
        outfile.println(maxScore);
        outfile.close();

    }

}
