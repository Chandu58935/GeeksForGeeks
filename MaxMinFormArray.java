import java.io.*;
import java.util.*;

public class MaxMinFormArray {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //array declaration
    int size = scan.nextInt();
    int[] arr = new int[size];
    for (int i = 0;i<size ;i++ ) {
      arr[i] = scan.nextInt();
    }
    //array sort
    Arrays.sort(arr);
    //temp array declaration
    int[] temp = new int[size];
    int small = 0,large=size-1;
    boolean flag = true;
    //max min formation
    for (int i = 0;i<size ;i++ ) {
      if (flag) {
        temp[i] = arr[large--];
      }
      else {
        temp[i] = arr[small++];
      }
      flag = !flag;
    }
    //copying temp values to arr
    arr = temp.clone();
    System.out.println("Max Min Form:-");
    for (int i = 0;i<size ;i++ ) {
      System.out.printf(arr[i]+"\t");
    }
  }
}
