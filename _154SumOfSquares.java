public class _154SumOfSquares {
    public static void main(String[] args) {
        //Find the sum of the squares of the elements in the array [1, 2, 3, 4, 5].
       int[] arr = {1, 2, 3, 4, 5};
       int sum = 0;
       for(int i = 0; i < arr.length; i++){
        int sq = arr[i] * arr[i];
        sum += sq;
    }
    System.out.println(sum);

    }
}
