public class _179SumOfTw0Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1};
        int[] arr2 = {1, 1, 1, 1};
        int result = 0;
        for(int i = 0; i < arr1.length; i++){
          result += arr1[i] + arr2[i];
        }
        System.out.println(result);
    }
}
