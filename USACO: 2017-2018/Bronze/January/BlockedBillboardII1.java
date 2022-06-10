//http://www.usaco.org/index.php?page=viewproblem2&cpid=783

import java.util.*;
import java.io.*;

public class BlockedBillboardII1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("billboard.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ax1 = Integer.parseInt(st.nextToken());
        int ay1 = Integer.parseInt(st.nextToken());
        int ax2 = Integer.parseInt(st.nextToken());
        int ay2 = Integer.parseInt(st.nextToken());
        int lawnArea = Math.abs(ax1 - ax2) * Math.abs(ay1 - ay2);

        st = new StringTokenizer(br.readLine());

        int bx1 = Integer.parseInt(st.nextToken());
        int by1 = Integer.parseInt(st.nextToken());
        int bx2 = Integer.parseInt(st.nextToken());
        int by2 = Integer.parseInt(st.nextToken());

        int corner = 0;
        if (isCovered(ax1, ay1, bx1, by1, bx2, by2))
            corner++;
        if (isCovered(ax2, ay1, bx1, by1, bx2, by2))
            corner++;
        if (isCovered(ax2, ay2, bx1, by1, bx2, by2))
            corner++;
        if (isCovered(ax1, ay2, bx1, by1, bx2, by2))
            corner++;

        System.out.println(corner);
        if (corner == 0 || corner == 1) {
            pw.println(lawnArea);
        } else if (corner == 2) {
            int intersection = (Math.min(ax2, bx2) - Math.max(ax1, bx1)) * (Math.min(ay2, by2) - Math.max(ay1, by1));
            pw.println(lawnArea - intersection);
        }

        else if (corner == 4) {
            pw.println(0);
        }

        pw.close();

    }

    public static boolean isCovered(int x, int y, int x1, int y1, int x2, int y2) {
        return x >= x1 && x <= x2 && y >= y1 && y <= y2;
    }
}
