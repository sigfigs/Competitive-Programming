//http://www.usaco.org/index.php?page=viewproblem2&cpid=1059

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class DoYouKnowYourABCs1 {
    static BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(r.readLine());
        int[] sevenNums = new int[7];
        for (int i = 0; i < 7; i++) {
            sevenNums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sevenNums);

        int A = sevenNums[0];
        int B = sevenNums[1];
        int C = sevenNums[6] - A - B;

        pw.print(A + " ");
        pw.print(B + " ");
        pw.print(C);
        pw.close(); // make sure to include this line -- closes io and flushes the output

    }
}
