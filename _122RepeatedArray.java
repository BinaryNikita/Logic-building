//1.create an integer array with values- 22, 32, 45, 22, 56, 22, 78.
//Find out the value that have occurred maximum number of times and 
//also show number of count. Example 22 is most occurred value with a count of 3.

public class _122RepeatedArray {
    public static void main(String[] args) {
        int[] arr = {21, 32, 32, 45, 23, 56};
        int max = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0; 
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++; 
                }
            }
            if (count > max) {
                max = count; 
                num = arr[i]; 
            }
        }
        System.out.println(num + " " + max);
    }
}


