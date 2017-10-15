import java.io.*;
import java.util.*;

public class UnionAndIntersection {
  public static void main(String[] args) {
    int m,n;
    Scanner scan = new Scanner(System.in);
    m = scan.nextInt();
    n = scan.nextInt();
    int[] firstArray = new int[m];
    int[] secondArray = new int[n];

    for (int i = 0; i < m ; i++ ) {
      firstArray[i] = scan.nextInt();
    }
    for (int j = 0; j < n ; j++ ) {
      secondArray[j] = scan.nextInt();
    }
    UnionAndIntersection union = new UnionAndIntersection();
    union.printUnion(firstArray,secondArray,m,n);
  }
  public int printUnion(int arr1[],int arr2[],int a,int b) {
    int i = 0, j = 0;
    while (i < a && j < b) {
      if (arr1[i] < arr2[j]) {
        System.out.print(arr1[i++]+ " ");
      }
      else if (arr2[j] < arr1[i]) {
        System.out.print(arr2[j++]+ " ");
      }
      else {
        System.out.print(arr2[j++]+ " ");
        i++;
      }
    }
    while (i < a) {
      System.out.print(arr1[i++]+ " ");
    }
    while (j < b) {
      System.out.print(arr2[j++]+ " ");
    }
    return 0;
  }


}
