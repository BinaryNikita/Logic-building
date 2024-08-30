public class _153CubesOf1stFiveInteger {
    public static void main(String[] args) {
        // 48. Create an array of the cubes of the first 5 positive integers.
        int[] arr = new int[5];
        int ind = 0;
        for(int i = 1; i <= arr.length; i++){
            int cube = i*i*i;
          arr[ind] = cube;
          System.out.println(arr[ind]);
        }
        ind++;
    }
}
