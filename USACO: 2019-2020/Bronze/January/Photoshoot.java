//http://www.usaco.org/index.php?page=viewproblem2&cpid=988
//unsolved

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class Photoshoot {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("photo.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("photo.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        // b
        st = new StringTokenizer(br.readLine());
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        int mods = 0;
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a);
            if (a.get(i) != b[i]) {
                a.remove(b[i]);
                a.add(i, b[i]);
                mods++;

            }
        }
        pw.println(mods);
    }
}
