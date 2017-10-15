import java.io.*;
import java.util.*;

public class SlidingWindowMaximum {
  public static void main(String[] args) {
    int m,k,j,max;
    Scanner scan = new Scanner(System.in);
    m = scan.nextInt();
    int[] slide = new int[m];
    for (int i = 0; i < m ; i++ ) {
      slide[i] = scan.nextInt();
    }
    k = scan.nextInt();
    for (int i = 0; i <= m-k ;i++ ) {
      max = slide[i];
      for (j = 1;j < k ;j++ ) {
        if (slide[i+j] > max) {
          max = slide[i+j];
        }
      }
      System.out.print(max + " ");
    }
  }
}
