public class _189MaxIn2D {
    public static void main(String[] args) {
        //Find the maximum element in the 2D array [[5, 7], [1, 8]].

        int[][] arr = {{5, 7},{1, 8}};
        int max = arr[0][0];
        for(int[] a: arr){
           for(int b: a){
            if(b > max){
                max = b;
            }
           }
        }
        System.out.println(max);

    }
}
