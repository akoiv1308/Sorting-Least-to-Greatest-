import java.util.*;

class Main {

  public static void main(String[] args) {
    int[] arr = {0,9,7,2,4,10,0,1,5,3,6}; // initializing an array //
    System.out.println("Least to Greatest: ");
    System.out.println(Arrays.toString(leastToGreatest(arr)));
    System.out.println("Greatest to Least: ");
    System.out.println(Arrays.toString(greatestToLeast(arr)));
  }

  public static int[] leastToGreatest(int[] arr) {
    for(int i = 0; i < arr.length-1; i++) { // for every value in the array //
      for(int j = arr.length-1; j > i; j--) { // going backwards //
        if(arr[i] > arr[j]) { // if, for instance, first value is greater than the last value in the array //
          int temp = arr[i]; // storing greater value in a temporary variable (place holder) //
          arr[i] = arr[j]; // setting lower value as the first value (in front) //
          arr[j] = temp; // setting higher value to the end of the array, which was stored in a temp int //
        }
      }
    }
   return arr;
  }

  public static int[] greatestToLeast(int[] arr) {
    // same process, however, reversed //
    for(int i = 0; i < arr.length-1; i++) {
      for(int j = arr.length-1; j > i; j--) {
        if(arr[i] < arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
   return arr;
  }

}

