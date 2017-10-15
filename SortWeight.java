import java.io.*;
import java.util.*;
import java.math.*;

public class SortWeight {
  public static int getWeight(int n) {
    int w = 0;
    double root = Math.sqrt(n);
    if (root == Math.ceil(root)) {
      w+= 5;
    }
    if (n%4 == 0 && n%6 == 0) {
      w+= 4;
    }
    if (n%2 == 0) {
      w+= 3;
    }
    return w;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int numbers[] = new int[num];
    int weights[] = new int[num];
    for (int i = 0; i < num ; i++) {
      numbers[i] = scan.nextInt();
    }
    for (int i = 0; i < num ; i++ ) {
      weights[i] = getWeight(numbers[i]);
    }
    System.out.println("Before Sorting");
    for (int i = 0; i < num ;i++ ) {
      System.out.println(numbers[i] + ":" + weights[i]);
    }
    for (int i = 0; i < num ; i++ ) {
      for (int j = 0; j < num-i-1 ;j++ ) {
        if (weights[j] > weights[j+1]) {
          int t = weights[j+1];
          weights[j+1] = weights[j];
          weights[j] = t;
          t = numbers[j+1];
          numbers[j+1] = numbers[j];
          numbers[j] = t;
        }
      }
    }
    System.out.println("After Sorting");
    for (int i = 0; i < num ;i++ ) {
      System.out.println(numbers[i] + ":" + weights[i]);
    }
  }
}
