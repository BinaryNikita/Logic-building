public class _155ArrayWithfirstSquare {
    public static void main(String[] args) {
        // Create an array of the square of the first 5 positive integers.
        int[] arr = new int[5];
        int ind = 0;
        for(int i = 1; i <= arr.length; i++){
            int sq = i * i;
            arr[ind] = sq;
            System.out.println(arr[ind]);
            ind++;
        }

    }
}
