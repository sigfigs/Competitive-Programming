//http://www.usaco.org/index.php?page=viewproblem2&cpid=1011

import java.util.*;
import java.io.*;

public class Triangles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("triangles.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("triangles.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        // store coordinates into two arrays
        int[] xVals = new int[N];
        int[] yVals = new int[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            xVals[i] = Integer.parseInt(st.nextToken());
            yVals[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (isValidTriangle(xVals[i], yVals[i], xVals[j], yVals[j], xVals[k], yVals[k])) {
                        // calculate the area
                        int a = xVals[i];
                        int b = yVals[i];
                        int c = xVals[j];
                        int d = yVals[j];
                        int e = xVals[k];
                        int f = yVals[k];
                        int area = (Math.abs((a * d + c * f + e * b) - (b * c + d * e + f * a)));
                        area = area / 2;
                        if (area == 43626025) {

                        }

                        max = Math.max(max, area);
                    }
                }
            }
        }
        pw.println(max * 2);
        pw.close();

    }

    public static boolean isValidTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        boolean parrallelX = false;
        boolean parrallelY = false;
        if ((y2 - y1) == 0)
            parrallelX = true;
        else if ((y3 - y2) == 0)
            parrallelX = true;
        else if ((y3 - y1) == 0)
            parrallelX = true;

        if ((x2 - x1) == 0)
            parrallelY = true;
        else if ((x3 - x2) == 0)
            parrallelY = true;
        else if ((x3 - x1) == 0)
            parrallelY = true;

        return parrallelX && parrallelY;
        // return true;
    }
}
