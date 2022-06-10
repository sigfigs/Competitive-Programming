//http://www.usaco.org/index.php?page=viewproblem2&cpid=963

import java.util.*;
import java.io.*;

public class CowGymnastics1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("gymnastics.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
        int[][] cows = new int[row][column];
        for (int i = 0; i < cows.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < cows[i].length; j++) {
                cows[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[] pair1 = new int[column * (column - 1) / 2];
        int[] pair2 = new int[column * (column - 1) / 2];
        int[] row1 = new int[column];

        for (int i = 0; i < column; i++) {
            row1[i] = cows[0][i];
        }
        int pairIndex = 0;
        for (int i = 0; i < row1.length; i++) {
            for (int j = i + 1; j < row1.length; j++) {
                pair1[pairIndex] = row1[i];
                pair2[pairIndex] = row1[j];
                pairIndex++;
            }
        }
        System.out.println(Arrays.toString(pair1));
        System.out.println(Arrays.toString(pair2));

        boolean isConsistent = true;
        int consistents = 0;
        pairIndex = 0;
        int index = 0;
        int index2 = 0;
        int rowIndex = 0;
        int rowIndex2 = 0;
        int val = 0;
        int val2 = 0;
        while (pairIndex < pair1.length) {
            for (int i = 1; i < cows.length; i++) {
                for (int j = 0; j < cows[i].length; j++) {
                    if (cows[i][j] == pair1[pairIndex]) {
                        index = j;
                        rowIndex = i;
                        val = cows[i][j];
                    } else if (cows[i][j] == pair2[pairIndex]) {
                        index2 = j;
                        rowIndex2 = i;
                        val2 = cows[i][j];
                    }
                }
                System.out.println("index: " + index + "  row: " + rowIndex + "  value: " + val);
                System.out.println("index: " + index2 + "  row: " + rowIndex2 + "  value: " + val2);
                System.out.println("-----------");
                if (index > index2) {
                    isConsistent = false;
                }
            }
            pairIndex++;
            if (isConsistent == true) {
                consistents += 1;
            }
            isConsistent = true;
        }

        pw.println(consistents);
        pw.close();
        System.out.println(consistents);

    }
}
