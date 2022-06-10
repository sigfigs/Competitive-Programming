//http://www.usaco.org/index.php?page=viewproblem2&cpid=1179

import java.io.*;
import java.util.StringTokenizer;

public class Herdle {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {

        char[][] correct = new char[3][3];
        char[][] guess = new char[3][3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j = 0; j < 3; j++) {
                correct[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j = 0; j < 3; j++) {
                guess[i][j] = str.charAt(j);
            }
        }

        int green = 0;
        int yellow = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (correct[i][j] == guess[i][j])
                    green++;
            }
        }

        char[] set = new char[9];
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!contains(set, guess[i][j])) {
                    set[index] = guess[i][j];
                    index++;
                }
            }
        }

        for (int i = 0; i < set.length; i++) {
            yellow += solve(correct, guess, set[i]);
        }

        System.out.println(green);
        System.out.println(yellow);
    }

    public static void print2D(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean contains(char[] arr, char ch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch)
                return true;
        }

        return false;
    }

    public static int solve(char[][] key, char[][] g, char c) {
        int keyCount = 0;
        int gCount = 0;
        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key[i].length; j++) {
                if (g[i][j] != key[i][j] && g[i][j] == c)
                    gCount++;
                if (key[i][j] != g[i][j] && key[i][j] == c)
                    keyCount++;
            }
        }
        return Math.min(gCount, keyCount);
    }
}
