import java.io.*;
import java.util.*;

public class CountSquares {
  public static void main(String[] args) {
    int count = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("First Number:-");
    int a = scan.nextInt();
    System.out.println("Second Number:-");
    int b = scan.nextInt();
    for (int i = a; i <= b ;i++ ) {
      for (int j = 1; j*j <= i ;j++ ) {
        if (j*j==i) {
          count++;
          System.out.printf(j*j +"\t");
        }
      }
    }
    System.out.print("No. of Squares in between"+a+"and"+b+":-");
    System.out.println(count);
  }
}
