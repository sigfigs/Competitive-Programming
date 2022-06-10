//http://www.usaco.org/index.php?page=viewproblem2&cpid=1155

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class LonelyPhoto1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numCows = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String cows = st.nextToken();

        int ans = 0;
        for (int i = 0; i <= numCows - 3; i++) {
            System.out.println(i);
            String s = "";
            for (int j = i; j < numCows; j++) {
                System.out.println(j);
                s += cows.charAt(j);
                System.out.println(s);
                if (counter(s, "H") > 1 && counter(s, "G") > 1)
                    ans += 1;
            }

            pw.println(ans);
            pw.close();

        }
    }

    public static int counter(String str, String animal) {
        int h = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(animal)) {
                h++;
            }
        }
        return h;
    }
}
