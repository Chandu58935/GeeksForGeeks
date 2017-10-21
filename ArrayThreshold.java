import java .io.*;
import java.util.*;

public class ArrayThreshold {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //size of the array
    System.out.println("array size = ");
    int size = scan.nextInt();
    //input array
    System.out.println("Array :-");
    int[] arr = new int[size];
    for (int i=0;i<size ;i++ ) {
      arr[i] = scan.nextInt();
    }
    //threshold input value
    System.out.println("Threshold=");
    int threshold = scan.nextInt();
    //no of counts
    int count = 0;
    for (int i=0;i<size ;i++ ) {
      //set div =0
      int div = 0;
      div = arr[i]/threshold;
      if (arr[i]%threshold!=0) {
        div++;
        System.out.println(div);
      }
      else {
        System.out.println(div);
      }
      count+=div;
    }
    System.out.println(count);
   }
}
