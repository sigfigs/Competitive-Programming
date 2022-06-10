//http://www.usaco.org/index.php?page=viewproblem2&cpid=1180

import java.io.*;
import java.util.StringTokenizer;

public class NonTransitiveDice {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        int[][] A = new int[t][4];
        int[][] B = new int[t][4];
        for (int testcase = 0; testcase < t; testcase++) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 4; i++) {
                A[testcase][i] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < 4; i++) {
                B[testcase][i] = Integer.parseInt(st.nextToken());
            }
        }
        // -------------------------------------------------------------------\\

        for (int testcase = 0; testcase < t; testcase++) {
            boolean isTie = false;
            boolean isNontrans = false;

            for (int num1 = 1; num1 <= 10; num1++) {

                for (int num2 = 1; num2 <= 10; num2++) {

                    for (int num3 = 1; num3 <= 10; num3++) {

                        for (int num4 = 1; num4 <= 10; num4++) {
                            int[] C = { num1, num2, num3, num4 };
                            if (betterDice(A[testcase], B[testcase]) == -1) {
                                isTie = true;
                                break;
                            } else if (betterDice(A[testcase], B[testcase]) == 1 && betterDice(B[testcase], C) == 1
                                    && betterDice(C, A[testcase]) == 1) {
                                isNontrans = true;
                                break;
                            } else if (betterDice(B[testcase], A[testcase]) == 1 && betterDice(C, B[testcase]) == 1
                                    && betterDice(C, A[testcase]) == 2) {
                                isNontrans = true;
                                break;
                            }
                        }

                        if (isTie)
                            break;
                        else if (isNontrans)
                            break;
                    }

                    if (isTie)
                        break;
                    else if (isNontrans)
                        break;
                }

                if (isTie)
                    break;
                else if (isNontrans)
                    break;
            }

            if (isTie) {
                System.out.println("no");
            } else if (isNontrans) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }

    }

    public static int betterDice(int[] x, int[] y) {
        int xCount = 0;
        int yCount = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (x[i] > y[j])
                    xCount++;
            }
        }

        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (y[i] > x[j])
                    yCount++;
            }
        }
        if (xCount > yCount)
            return 1;
        else if (yCount > xCount)
            return 2;
        else
            return -1; // if the probabilities tie
    }
}
