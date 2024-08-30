public class _158DuplicateArrayElement {
    // 37. Check if the array [1, 2, 3, 4, 5] contains duplicates.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2};
        int el = 0;
        boolean contains = false;
        for(int i = 1; i < arr.length; i++){
           for (int j = i + 1; j < arr.length; j++){
            if(arr[i] == arr[j]){
                contains = true;
                el = arr[i];
              }
           }
        }
        
        if(contains){
            System.out.println("Array contains duplicate element" + el);
        } else{
            System.out.println("No duplicate found");
        }
    }
}
