import java.util.Arrays;

public class _220RemoveDuplicates {
  /*
   * Example 1:
   * 
   * Input: nums = [1,1,2]
   * Output: 2, nums = [1,2,_]
   * Explanation: Your function should return k = 2, with the first two elements
   * of nums being 1 and 2 respectively.
   * It does not matter what you leave beyond the returned k (hence they are
   * underscores).
   * Example 2:
   * 
   * Input: nums = [0,0,1,1,1,2,2,3,3,4]
   * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
   * Explanation: Your function should return k = 5, with the first five elements
   * of nums being 0, 1, 2, 3, and 4 respectively.
   * It does not matter what you leave beyond the returned k (hence they are
   * underscores).
   */
  public static void main(String[] args) {

    int arr[] = { 1, 3, 4, 1, 2, 2, 3 };

    int k = arr.length - 1;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      int j = i + 1;
      if (j < arr.length) {
        if (arr[i] == arr[j]) {
          int temp = arr[j];
          arr[j] = arr[k];
          arr[k] = temp;
        }
      }
      k--;
    }

    System.out.println(Arrays.toString(arr));
  }

}

class Solution {
  /*
   * Example 1:
   * 
   * Input: nums = [1,1,2]
   * Output: 2, nums = [1,2,_]
   * Explanation: Your function should return k = 2, with the first two elements
   * of nums being 1 and 2 respectively.
   * It does not matter what you leave beyond the returned k (hence they are
   * underscores).
   * Example 2:
   * 
   * Input: nums = [0,0,1,1,1,2,2,3,3,4]
   * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
   * Explanation: Your function should return k = 5, with the first five elements
   * of nums being 0, 1, 2, 3, and 4 respectively.
   * It does not matter what you leave beyond the returned k (hence they are
   * underscores).
   */
  public int removeDuplicates(int[] arr) {
    int k = arr.length - 1;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      int j = i + 1;
      if (j < arr.length) {
        if (arr[i] == arr[j]) {
          int temp = arr[j];
          arr[j] = arr[k];
          arr[k] = temp;
        }
      }
      k--;
      System.out.println(Arrays.toString(arr));
    }

    return arr[0];
  }
}

class Solution2 {
  public int removeDuplicates(int[] nums) {

    if (nums.length == 0) {
      return 0;
    }

    int uniqueIndex = 0;

    for (int i = 1; i < nums.length; i++) {

      if (nums[i] != nums[uniqueIndex]) {
        uniqueIndex++;
        nums[uniqueIndex] = nums[i];
      }
    }
    return uniqueIndex + 1;
  }

  public static void main(String[] args) {
    Solution2 ob = new Solution2();
    System.out.println(ob.removeDuplicates(new int[] { 1, 2, 5, 6, 1, 1, 2, 3 }));
//     int k=1;
// for(int i=1;i<arr.length;i++){
//     if(arr[i]!=arr[i-1]){
//       arr[k]=arr[i];
//       k++;
//     }
      
// }
// return k;
  }
}


