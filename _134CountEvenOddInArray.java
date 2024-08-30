public class _134CountEvenOddInArray {
    public static void main(String[] args) {
        /* Count the number of even numbers in the array [13, 14, 15, 16, 17, 18]. 
        Count the number of odd numbers in the array [19, 20, 21, 22, 23, 24]. */
        int[] arr = {13, 14, 15, 16, 17, 18, 19};
        int oddCount = 0;
        int evenCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0){
                evenCount++;
            } else{
                oddCount++;
            }
        }
        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}
