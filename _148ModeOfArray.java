public class _148ModeOfArray {
public static void main(String[] args) {
    // 30. Find the mode of the array [2, 3, 2, 5, 2, 6, 2].
    int[] arr = {2, 3, 2, 5, 2, 6, 2};
        int max = 0;
        int mode = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0; 
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++; 
                }
            }
            if (count > max) {
                max = count; 
                mode = arr[i]; 
            }
        }
        System.out.println(mode + " " + max);
    }
}





