import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class DaisyChains2 {
   static BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pw = new PrintWriter(System.out);

   public static void main(String[] args) throws IOException {

      // parsing
      StringTokenizer st = new StringTokenizer(r.readLine());
      int N = Integer.parseInt(st.nextToken());
      StringTokenizer st1 = new StringTokenizer(r.readLine());
      int[] arr = new int[N];
      for (int i = 0; i < N; i++) {
         arr[i] = Integer.parseInt(st1.nextToken());
      }

      // algo
      int counter = 0;
      float totalPetals = 0;
      float average = 0;

      for (int i = 0; i < arr.length; i++) { //
         for (int j = i + 1; j < arr.length; j++) {

            for (int k = i; k < j + 1; k++) { // we are now in one of the pairs (inclusive)
               totalPetals += arr[k];
            }

            average = totalPetals / (j - i + 1);
            totalPetals = 0;

            for (int k = i; k < j + 1; k++) { // we are now in one of the pairs (inclusive)
               if (arr[k] == average) {
                  counter += 1;
                  break;
               }
            }
         }
      }
      pw.print(counter + arr.length);
      pw.close();
   }

}
