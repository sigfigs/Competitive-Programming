//http://www.usaco.org/index.php?page=viewproblem2&cpid=964

import java.io.*;
import java.util.*;

public class WhereAmI2 {
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio("whereami");
        int n = io.nextInt();
        String street = io.next();
        Set<String> set = new TreeSet<>();
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            boolean good = true;
            ans = i;
            for (int j = 0; j <= n - i; j++) {
                if (set.contains(street.substring(j, j + i))) {
                    good = false;
                    break;
                } else {
                    set.add(street.substring(j, j + i));

                }
            }

            if (good) {
                io.println(ans);
                io.close();
                break;
            }
        }

    }

    static class Kattio extends PrintWriter {
        private BufferedReader r;
        private StringTokenizer st;

        // standard input
        public Kattio() {
            this(System.in, System.out);
        }

        public Kattio(InputStream i, OutputStream o) {
            super(o);
            r = new BufferedReader(new InputStreamReader(i));
        }

        // USACO-style file input
        public Kattio(String problemName) throws IOException {
            super(new FileWriter(problemName + ".out"));
            r = new BufferedReader(new FileReader(problemName + ".in"));
        }

        // returns null if no more input
        public String next() {
            try {
                while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(r.readLine());
                return st.nextToken();
            } catch (Exception e) {
            }
            return null;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}