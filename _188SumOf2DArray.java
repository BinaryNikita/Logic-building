public class _188SumOf2DArray {
    public static void main(String[] args) {
        // 55. Find the sum of all elements in the 2D array [[1, 2], [3, 4]].

        int[][] arr = {{1,2},{3,4}};
        int sum = 1;
        for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr.length; j++){
          sum *= arr[i][j];
        } 

    }
    System.out.println(sum);

    }
}
