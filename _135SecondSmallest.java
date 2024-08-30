public class _135SecondSmallest {
    public static void main(String[] args) {
        //27. Find the second smallest element in the array [3, 1, 4, 1, 5, 9].
        int[] arr = {3, 1, 4, 1, 5, 9};
        int smallest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        int secondSmallest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(secondSmallest > arr[i] && arr[i] != smallest){
                secondSmallest = arr[i];

            }
        }
        System.out.println(secondSmallest);
     
    }
}
