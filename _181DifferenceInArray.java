public class _181DifferenceInArray {
    public static void main(String[] args) {
        //35. Find the difference between the arrays [1, 2, 3] and [2, 3, 4].

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 3, 4};
        int sum1 = 0;
        int sum2 = 0;

        for(int arr: arr1){
            sum1 += arr;
        }
        for(int arr: arr2){
            sum2 += arr;
        }
        int diff = sum2 - sum1;
        System.out.println(diff);
    }
}
