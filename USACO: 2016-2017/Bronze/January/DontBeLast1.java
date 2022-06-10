//http://www.usaco.org/index.php?page=viewproblem2&cpid=687

import java.io.*;
import java.util.*;

public class DontBeLast1 {
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio("notlast");
        int n = io.nextInt();
        Map<String, Integer> cows = new TreeMap<String, Integer>();
        cows.put("Bessie", 0);
        cows.put("Elsie", 0);
        cows.put("Daisy", 0);
        cows.put("Gertie", 0);
        cows.put("Annabelle", 0);
        cows.put("Maggie", 0);
        cows.put("Henrietta", 0);
        String s = "";
        for (int i = 0; i < n; i++) {
            String c = io.next();
            s = c;
            Integer original = cows.get(c);
            cows.put(c, original + io.nextInt());
        }

        int min = cows.get(s);
        for (String k : cows.keySet()) {
            min = Math.min(cows.get(k), min);

        }

        int secondMin = 10000000;
        String ans = "";
        for (String k : cows.keySet()) {
            if (cows.get(k) > min && cows.get(k) < secondMin) {

                secondMin = cows.get(k);
                ans = k;

            }
        }

        int nums = 0;
        for (String k : cows.keySet()) {
            if (cows.get(k) == secondMin) {
                nums++;
            }
        }

        if (nums > 1) {
            io.println("Tie");
        } else {
            io.println(ans);

        }

        io.close();

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