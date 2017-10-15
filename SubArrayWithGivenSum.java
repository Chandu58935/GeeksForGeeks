import java.io.*;
import java.util.*;

public class SubArrayWithGivenSum {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int testCase = scan.nextInt();
      for (int i = 0;i < testCase ;i++ ) {
        int sizeOfArray = scan.nextInt();
        int targetSum = scan.nextInt();
        int sum = 0;
        int array[] = new int[sizeOfArray];
        int index = 1;
        for ( index = 1; index <= sizeOfArray ;index++ ) {
          array[index] = scan.nextInt();
          sum = sum + array[index];
          if (sum > targetSum) {
            sum = 0;
            for (index = index+1;index <=sizeOfArray ;index++ ) {
              sum = sum + array[index];
              if (sum == targetSum) {
                System.out.println(index);
              }
            }
          }
        }
    }
  }
}
