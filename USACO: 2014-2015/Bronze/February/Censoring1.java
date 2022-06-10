//http://www.usaco.org/index.php?page=viewproblem2&cpid=526

import java.util.*;
import java.io.*;

public class Censoring1 {
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new FileReader("censor.in"));
      PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("censor.out")));
      StringTokenizer st = new StringTokenizer(br.readLine());
      String s = st.nextToken();
      st = new StringTokenizer(br.readLine());
      String t = st.nextToken();
      StringBuilder ans = new StringBuilder();

      for (int i = 0; i < s.length(); i++) {
         ans = ans.append(s.charAt(i));
         if (ans.length() >= t.length() && ans.substring(ans.length() - t.length(), ans.length()).equals(t)) {
            ans.delete(ans.length() - t.length(), ans.length());
         }
      }

      pw.println(ans);
      pw.close();
   }
}
