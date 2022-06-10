//http://www.usaco.org/index.php?page=viewproblem2&cpid=615

import java.util.*;
import java.io.*;

public class MilkPails1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("pails.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("pails.out")));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int least = Math.min(x, y);
        int greater = Math.max(x, y);
        int max = least;
        int numIts = m / least;
        int current = 0;

        int index = 0;
        int counter = 0;
        int counter2 = numIts;
        int newnumIts = numIts;
        while (counter <= numIts) {

            for (counter2 = newnumIts; counter2 >= 1; counter2--) {
                current += least;
                index = counter2;
            }
            newnumIts--;
            for (int j = 0; j < numIts - index; j++) {
                if (current + greater <= m) {
                    current += greater;
                }
            }
            max = Math.max(max, current);

            System.out.println(max);
            counter++;
            current = 0;
        }

        pw.println(max);
        pw.close();

    }
}
