//http://www.usaco.org/index.php?page=viewproblem2&cpid=761

import java.util.*;
import java.io.*;

public class MilkMeasurement3 {
    private static int bess = 7;
    private static int els = 7;
    private static int mil = 7;
    private static int max = 7;
    private static int counter = 0;
    private static String display = "BessieElsieMildred";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("measurement.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("measurement.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] day = new int[n];
        String[] cow = new String[n];
        String[] delta = new String[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            day[i] = Integer.parseInt(st.nextToken());
            cow[i] = st.nextToken();
            delta[i] = st.nextToken();
        }

        // bubble sort all arrays
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (day[j] > day[j + 1]) {
                    int temp = day[j + 1];
                    day[j + 1] = day[j];
                    day[j] = temp;

                    String temp1 = cow[j + 1];
                    cow[j + 1] = cow[j];
                    cow[j] = temp1;

                    String temp2 = delta[j + 1];
                    delta[j + 1] = delta[j];
                    delta[j] = temp2;
                }
            }
        }
        int[] numDelta = new int[n];

        for (int i = 0; i < n; i++) {
            numDelta[i] = Integer.parseInt(delta[i].substring(1));
        }

        for (int i = 0; i < n; i++) {
            if (cow[i].equals("Bessie")) {
                if (delta[i].substring(0, 1).equals("-")) {
                    bess -= numDelta[i];
                } else {
                    bess += numDelta[i];
                }
                updateDisplay();
            }

            // NEXTCOWNEXTCOWNEXTCOWNEXTCOWNEXTCOWNEXTCOWNEXTCOWNEXTCOWNEXTCOWNEXTCOWNEXTCOW

            else if (cow[i].equals("Mildred")) {
                if (delta[i].substring(0, 1).equals("-")) {
                    mil -= numDelta[i];
                } else {
                    mil += numDelta[i];
                }
                updateDisplay();
            }

            // NEXTCOWNEXTCOWNEXTCOW
            else if (cow[i].equals("Elsie")) {
                if (delta[i].substring(0, 1).equals("-")) {
                    els -= numDelta[i];
                } else {
                    els += numDelta[i];
                }
                updateDisplay();
            }
        }

        pw.println(counter);
        pw.close();
    }

    public static void updateDisplay() {
        int maxRate = Math.max(bess, mil);
        maxRate = Math.max(els, maxRate);
        maxRate = Math.max(maxRate, mil);

        max = maxRate;
        ArrayList<String> top = new ArrayList<String>();

        if (bess == maxRate) {
            top.add("B");
        }
        if (mil == maxRate) {
            top.add("M");
        }
        if (els == maxRate) {
            top.add("E");
        }

        String newDisplay = "";
        for (int i = 0; i < top.size(); i++) {
            newDisplay += top.get(i);
        }

        if (!newDisplay.equals(display)) {
            counter++;
            display = newDisplay;
        }

    }
}
