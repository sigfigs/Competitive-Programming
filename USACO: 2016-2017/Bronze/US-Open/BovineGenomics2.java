//http://www.usaco.org/index.php?page=viewproblem2&cpid=736

import java.util.*;
import java.io.*;

public class BovineGenomics2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("cownomics.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cownomics.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] spotted = new String[N][M];
        String[][] plain = new String[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();
            for (int j = 0; j < M; j++) {
                spotted[i][j] = temp.substring(j, j + 1);

            }
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();
            for (int j = 0; j < M; j++) {
                plain[i][j] = temp.substring(j, j + 1);

            }
        }

        int counter = 0;
        for (int i = 0; i < M; i++) {
            String[] positionS = new String[N];
            String[] positionP = new String[N];
            for (int j = 0; j < N; j++) {
                positionS[j] = spotted[j][i];
                positionP[j] = plain[j][i];
            }
            if (notCommon(positionS, positionP))
                counter++;
        }

        pw.println(counter);
        pw.close();

    }

    public static boolean notCommon(String[] a, String[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i].equals(b[j]))
                    return false;
            }
        }
        return true;
    }
}
