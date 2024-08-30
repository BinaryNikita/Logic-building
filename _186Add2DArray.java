public class _186Add2DArray {
    public static void main(String[] args) {

                int[][] arr1 = {{1, 2}, {3, 4}};
                int[][] arr2 = {{5, 6}, {7, 8}};
                int sum = 0;
                for (int i = 0; i < arr1.length; i++) {
                    for (int j = 0; j < arr1[i].length; j++) {
                         sum += arr1[i][j] + arr2[i][j];
                        //  System.out.println(sum + " "  + i + " " + j);
                    }
                                }
                                  System.out.println(sum);
            }
        }
        