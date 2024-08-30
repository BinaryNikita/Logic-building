public class _184_2DArrayWithOnes {

    public static void main(String args[]){
        //51. Create a 2D array with 3 rows and 3 columns filled with ones.
        int[][] arr = new int[3][3];
    
        
            for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = 1;
            }
        }
            for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
               System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    
    }
}