//http://www.usaco.org/index.php?page=viewproblem2&cpid=568

import java.util.*;
import java.io.*;

public class SpeedingTicket2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] road = new int[n];
        int[] roadSpeed = new int[n];
        int[] bessie = new int[m];
        int[] bessieSpeed = new int[m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            road[i] = Integer.parseInt(st.nextToken());
            roadSpeed[i] = Integer.parseInt(st.nextToken());

        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            bessie[i] = Integer.parseInt(st.nextToken());
            bessieSpeed[i] = Integer.parseInt(st.nextToken());
        }

        int[] rS = new int[101];
        int[] bS = new int[101];

        int index = 0;
        int secondIndex = 0;
        for (int i = 1; i <= 100; i++) {
            if (index < roadSpeed.length) {
                rS[i] = roadSpeed[index];
                secondIndex++;
            }
            if (secondIndex >= road[index]) {
                index++;
                secondIndex = 0;
            }
        }

        index = 0;
        secondIndex = 0;
        for (int i = 1; i <= 100; i++) {
            if (index < bessieSpeed.length) {
                bS[i] = bessieSpeed[index];
                secondIndex++;
            }
            if (secondIndex >= bessie[index]) {
                index++;
                secondIndex = 0;
            }
        }

        int diff = 0;
        int max = 0;
        for (int i = 1; i <= 100; i++) {
            if (bS[i] > rS[i]) {
                diff = bS[i] - rS[i];
                max = Math.max(max, diff);
            }
        }

        pw.println(max);
        pw.close();
        // System.out.println(Arrays.toString(rS));
        // int count = 0;
        // for(int i = 0; i < rS.length; i++){
        // if(rS[i] == 35) count++;
        // }

        // System.out.println(count);

    }
}
