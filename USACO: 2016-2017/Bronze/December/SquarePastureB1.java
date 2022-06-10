//http://www.usaco.org/index.php?page=viewproblem2&cpid=663

import java.util.*;
import java.io.*;

public class SquarePastureB1 {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader("square.in"));
        PrintWriter outfile = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));

        StringTokenizer st = new StringTokenizer(file.readLine());
        int llx1 = Integer.parseInt(st.nextToken());
        int lly1 = Integer.parseInt(st.nextToken());
        int urx1 = Integer.parseInt(st.nextToken());
        int ury1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(file.readLine());
        int llx2 = Integer.parseInt(st.nextToken());
        int lly2 = Integer.parseInt(st.nextToken());
        int urx2 = Integer.parseInt(st.nextToken());
        int ury2 = Integer.parseInt(st.nextToken());

        int length = (Math.max(Math.max(Math.max(lly1, ury1), lly2), ury2)
                - Math.min(Math.min(Math.min(lly1, ury1), lly2), ury2));
        int width = (Math.max(Math.max(Math.max(llx1, urx1), llx2), urx2)
                - Math.min(Math.min(Math.min(llx1, urx1), llx2), urx2));
        int totalArea = length * width;
        // System.out.print(totalArea);
        int side = Math.max(length, width);
        outfile.print(side * side);
        outfile.close();

    }

}
