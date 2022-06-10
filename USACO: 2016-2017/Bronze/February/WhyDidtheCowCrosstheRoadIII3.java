//http://www.usaco.org/index.php?cpid=713&page=viewproblem2

import java.util.*;
import java.io.*;

public class WhyDidtheCowCrosstheRoadIII3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("cowqueue.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("cowqueue.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arrive = new ArrayList<Integer>();
        ArrayList<Integer> question = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arrive.add(Integer.parseInt(st.nextToken()));
            question.add(Integer.parseInt(st.nextToken()));
        }

        int curr = 0;
        while (!arrive.isEmpty()) {
            int index = 0;
            int min = arrive.get(0);
            for (int i = 0; i < arrive.size(); i++) {
                if (arrive.get(i) < min) {
                    min = arrive.get(i);
                    index = i;
                }
            }
            curr = Math.max(min, curr) + question.get(index);
            arrive.remove(index);
            question.remove(index);
        }
        pw.println(curr);
        pw.close();

    }

}
