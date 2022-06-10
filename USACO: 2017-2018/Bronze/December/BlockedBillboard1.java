//http://www.usaco.org/index.php?page=viewproblem2&cpid=759

import java.util.*;
import java.io.*;

public class BlockedBillboard1 {
    public static void main(String[] args) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader("billboard.in"));
        PrintWriter outfile = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));

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
        st = new StringTokenizer(file.readLine());
        int llxt = Integer.parseInt(st.nextToken());
        int llyt = Integer.parseInt(st.nextToken());
        int urxt = Integer.parseInt(st.nextToken());
        int uryt = Integer.parseInt(st.nextToken());

        outfile.print(intersectionAreaTruck(llx1, lly1, urx1, ury1, llx2, lly2, urx2, ury2, llxt, llyt, urxt, uryt));
        System.out.print(intersectionAreaTruck(llx1, lly1, urx1, ury1, llx2, lly2, urx2, ury2, llxt, llyt, urxt, uryt));
        outfile.close();

    }

    public static boolean intersects(int llx1, int lly1, int urx1, int ury1, int llx2, int lly2, int urx2, int ury2) {
        if (ury2 < lly1 || ury1 < lly2) {
            return false;
        }
        if (llx2 > urx1 || llx1 > urx2) {
            return false;
        }
        return true;
    }

    public static int intersectionArea(int llx1, int lly1, int urx1, int ury1, int llx2, int lly2, int urx2, int ury2) {
        int width = Math.min(urx1, urx2) - Math.max(llx2, llx1);
        int length = Math.min(ury1, ury2) - Math.max(lly1, lly2);
        if (width * length <= 0) {
            return 0;
        }
        return width * length;
    }

    public static int intersectionAreaTruck(int llx1, int lly1, int urx1, int ury1, int llx2, int lly2, int urx2,
            int ury2, int llxt, int llyt, int urxt, int uryt) {
        int length1 = Math.min(uryt, ury1) - Math.max(llyt, lly1);
        int width1 = Math.min(urxt, urx1) - Math.max(llxt, llx1);
        int length2 = Math.min(uryt, ury2) - Math.max(llyt, lly2);
        int width2 = Math.min(urxt, urx2) - Math.max(llxt, llx2);

        int intersectedRectangle1 = length1 * width1;
        if (intersectedRectangle1 <= 0) {
            intersectedRectangle1 = 0;
        }
        int intersectedRectangle2 = length2 * width2;
        if (intersectedRectangle2 <= 0) {
            intersectedRectangle2 = 0;
        }
        int bb1length = (urx1 - llx1);
        int bb1width = (ury1 - lly1);
        int bb2length = (urx2 - llx2);
        int bb2width = (ury2 - lly2);

        int visibleBillboard1 = bb1length * bb1width - intersectedRectangle1;
        int visibleBillboard2 = bb2length * bb2width - intersectedRectangle2;

        if (visibleBillboard1 < 0) {
            visibleBillboard1 = 0;
        }
        if (visibleBillboard2 < 0) {
            visibleBillboard2 = 0;
        }

        return visibleBillboard1 + visibleBillboard2;

    }
}