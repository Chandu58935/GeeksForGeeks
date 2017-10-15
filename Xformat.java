import java.io.*;
import java.util.*;

public class Xformat {
  public static void main(String[] args) {
    Xformat str = new Xformat();
    str.printPattern("vamsi");
  }
  void printPattern(String word) {
    int len = word.length();
    int k = len-1;
    for (int i = 0;i < len; i++) {

        if(i<k) {
          for (int x=0;x<i ;x++ ) {
            System.out.print(" ");
          }
          System.out.print(word.charAt(i));
          for (int x=0;x<k-i-1 ;x++ ) {
            System.out.print(" ");
          }
          System.out.println(word.charAt(k));
          k--;
        }
        if(i==k) {
          for (int x=0;x<i ;x++ ) {
            System.out.print(" ");
          }
          System.out.println(word.charAt(k));
          k--;
        }
        else if(i>k) {
          for (int x=k;x>=0 ;x-- ) {
            System.out.print(" ");
          }
          System.out.print(word.charAt(k));
          for (int x=0;x<i-k-1 ;x++ ) {
            System.out.print(" ");
          }
          System.out.println(word.charAt(i));
          k--;
        }

    }
  }
}
