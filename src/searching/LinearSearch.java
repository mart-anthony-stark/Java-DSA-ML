package searching;

/**
 * Returns the index of specified num
 */
public class LinearSearch{
  static int linearSearch(int[] arr, int num){
    for(int i=0; i<arr.length; i++){
      if(arr[i] == num) return i;
    }
    return -1;
  }
  public static void main(String[] args) {
    int arr[] = { 3, 60, 35, 2, 45, 320, 5 };
    System.out.println(linearSearch(arr, 320));
  }
}