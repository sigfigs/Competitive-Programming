//http://www.usaco.org/index.php?page=viewproblem2&cpid=1012

import java.util.*;
import java.io.*;

public class MadScientist {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("breedflip.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("breedflip.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        String desired = st.nextToken();
        st = new StringTokenizer(br.readLine());
        String curr = st.nextToken();

        int ans = 0;
        boolean isDiffPrev = false;
        boolean isDiff = false;

        for (int i = 0; i < n; i++) {
            if (desired.substring(i, i + 1).equals(curr.substring(i, i + 1)) == false) {
                isDiff = true;
                if (isDiff != isDiffPrev) {
                    ans++;
                }

            }
            isDiffPrev = isDiff;
            isDiff = false;
        }
        pw.println(ans);
        pw.close();
    }
}