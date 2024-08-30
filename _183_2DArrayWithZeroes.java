public class _183_2DArrayWithZeroes {
    //Create a 2D array with 3 rows and 3 columns filled with zeros.
    public static void main(String[] args) {
        
        int[][] arr = new int[3][3];
    
        
    //     for(int i = 0; i < arr.length; i++){
    //     for(int j = 0; j < arr.length; j++){
    //         arr[i][j] = 0;
    //     }
    // } // java by default gives zero to empty array so there is no need to give manually zero
        for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr.length; j++){
           System.out.print(arr[i][j]);
        }
        System.out.println();
    }

    
    }
}


