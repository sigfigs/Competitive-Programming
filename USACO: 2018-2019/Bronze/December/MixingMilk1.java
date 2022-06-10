//http://www.usaco.org/index.php?page=viewproblem2&cpid=855

import java.util.*;
import java.io.*;

public class MixingMilk1 {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader("mixmilk.in"));
        PrintWriter outfile = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));

        StringTokenizer st = new StringTokenizer(file.readLine());
        int b1c = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(file.readLine());
        int b2c = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(file.readLine());
        int b3c = Integer.parseInt(st.nextToken());
        int b3 = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= 33; i++) {
            b2 += b1;
            b1 = 0;
            if (b2 > b2c) {
                b1 = b2 - b2c;
                b2 = b2c;
            }

            b3 += b2;
            b2 = 0;
            if (b3 > b3c) {
                b2 = b3 - b3c;
                b3 = b3c;
            }

            b1 += b3;
            b3 = 0;
            if (b1 > b1c) {
                b3 = b1 - b1c;
                b1 = b1c;
            }
        }
        b2 += b1;
        b1 = 0;
        if (b2 > b2c) {
            b1 = b2 - b2c;
            b2 = b2c;
        }

        outfile.println(b1);
        outfile.println(b2);
        outfile.println(b3);
        outfile.close();

    }

}
