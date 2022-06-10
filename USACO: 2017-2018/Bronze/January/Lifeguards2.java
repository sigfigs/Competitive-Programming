//http://www.usaco.org/index.php?page=viewproblem2&cpid=784

import java.util.*;
import java.io.*;

public class Lifeguards2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("lifeguards.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("lifeguards.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            start[i] = Integer.parseInt(st.nextToken());
            end[i] = Integer.parseInt(st.nextToken());
        }

        int[] life = new int[1000];
        for (int i = 0; i < n; i++) {
            for (int j = start[i]; j < end[i]; j++) {
                life[j]++;
            }
        }
        int[] og = new int[1000];
        for (int i = 0; i < 1000; i++) {
            og[i] = life[i];
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = start[i]; j < end[i]; j++) {
                life[j]--;
            }

            int time = 0;
            for (int j = 0; j < 1000; j++) {
                if (life[j] >= 1)
                    time++;
            }
            max = Math.max(max, time);

            for (int j = 0; j < 1000; j++) {
                life[j] = og[j];
            }

        }

        pw.println(max);
        pw.close();
    }
}
