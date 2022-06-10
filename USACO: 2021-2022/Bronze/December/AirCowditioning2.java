//http://www.usaco.org/index.php?page=viewproblem2&cpid=1156
//Score: 7/10; Time limit exceeded on 8-10

import java.util.*;

public class AirCowditioning {
  private static int pointer1 = -1;
  private static int pointer2 = -1;
  private static boolean isPerfect = false;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numCows = sc.nextInt();
    int[] perfect = new int[numCows];
    int[] initial = new int[numCows];
    for (int i = 0; i < numCows; i++) {
      perfect[i] = sc.nextInt();
    }
    for (int i = 0; i < numCows; i++) {
      initial[i] = sc.nextInt();
    }

    int[] difference = new int[numCows];
    for (int i = 0; i < numCows; i++) {
      difference[i] = perfect[i] - initial[i];
    }
    longestContinuousNeg(difference);

    int numCmds = 0;
    while (isPerfect(difference) == false) {
      longestContinuousPos(difference);
      if (pointer1 != -1 && pointer2 != -1) {

        for (int i = pointer1; i <= pointer2; i++) {
          difference[i] -= 1;
        }
        numCmds += 1;
      }
      if (isPerfect(difference)) {
        break;
      }

      pointer1 = -1;
      pointer2 = -1;
      longestContinuousNeg(difference);
      if (pointer1 != -1 && pointer2 != -1) {

        for (int i = pointer1; i <= pointer2; i++) {
          difference[i] += 1;
        }
        numCmds += 1;
      }
      pointer1 = -1;
      pointer2 = -1;

    }

    System.out.println(numCmds);

  }

  public static void longestContinuousPos(int[] arr) {
    int currLen = 0;
    int maxLen = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 0) {
        currLen++;
      } else {
        if (currLen > maxLen) {
          maxLen = currLen;
          pointer2 = i - 1;
          pointer1 = pointer2 - maxLen + 1;
        }
        currLen = 0;
      }

      if (currLen > maxLen) {
        maxLen = currLen;
        pointer2 = i;
        pointer1 = pointer2 - maxLen + 1;
      }
    }

  }

  public static void longestContinuousNeg(int[] arr) {
    int currLen = 0;
    int maxLen = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        currLen++;
      } else {
        if (currLen > maxLen) {
          maxLen = currLen;
          pointer2 = i - 1;
          pointer1 = pointer2 - maxLen + 1;
        }
        currLen = 0;
      }

      if (currLen > maxLen) {
        maxLen = currLen;
        pointer2 = i;
        pointer1 = pointer2 - maxLen + 1;
      }
    }

  }

  public static boolean isPerfect(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        return false;
      }
    }
    return true;
  }
}
