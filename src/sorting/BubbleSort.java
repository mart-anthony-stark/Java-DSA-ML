package sorting;

public class BubbleSort {
  static void sort(int[] arr) {
    int temp = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j+1]) {
          // swap
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
    sort(arr);
    for (int x : arr) {
      System.out.print(x + " ");
    }
  }
}