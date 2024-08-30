public class _190MinIn2DArray {
    public static void main(String[] args) {
               //Find the maximum element in the 2D array [[5, 7], [1, 8]].

               int[][] arr = {{5, 7},{1, 8}};
               int min = arr[0][0];
               for(int[] a: arr){
                  for(int b: a){
                   if(b < min){
                       min = b;
                   }
                  }
               }
               System.out.println(min);
    }
}
