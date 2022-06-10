import java.io.*;
import java.util.*;

public class SquarePastureA1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("square.in"));
        PrintWriter pw = new PrintWriter("square.out");

        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();

        int minX = Math.min(ax1, ax2);
        minX = Math.min(minX, bx1);
        minX = Math.min(minX, bx2);

        int maxX = Math.max(ax1, ax2);
        maxX = Math.max(maxX, bx1);
        maxX = Math.max(maxX, bx2);

        int xDist = maxX - minX;

        int minY = Math.min(ay1, ay2);
        minY = Math.min(minY, by1);
        minY = Math.min(minY, by2);

        int maxY = Math.max(ay1, ay2);
        maxY = Math.max(maxY, by1);
        maxY = Math.max(maxY, by2);

        int yDist = maxY - minY;

        int maxSide = Math.max(xDist, yDist);

        pw.println(maxSide * maxSide);
        pw.close(); // make sure to include this line -- closes pw and flushes the output
    }
}