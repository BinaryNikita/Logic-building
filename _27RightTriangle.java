class RightTriangle {
    
    public static void main(String[] args) {
        int rows = 5;
        int i,j;
        for( i = 1; i <= rows; i++) {
            for( j = rows; j > i; j--) {
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
class RightTriangle2 {
    public static void main(String[] args) {
        int rows = 5;
        int i,j;
        for( i = rows; i >= 1; i--) {
            for( j = rows ; j > i; j--) {
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class RightTriangle5 {
    public static void main(String[] args) {
        int rows = 5;
        int i,j;
        // int count = 1; 
        for( i = 1; i <= rows; i++) {
            for( j = rows; j > i; j--) {
                System.out.print("  ");
            }
            // i = j;
            for(int k = 1; k <= i; k++) {
                System.out.print(k*2-1  + " ");
            }
            System.out.println();
        }
    }
}

class RightTriangle6{
    public static void main(String[] args) {
        int num = 5;
    for(int i = 1; i <= num; i++){
        for(int j = 1; j <= num-i; j++) {
            System.out.print(" ");
        }
        for(int k =i; k >= 1; k--){
            System.out.print(k);
        }
        
        for(int l = 2; l <= i; l++){
            System.out.print(l);
        }
        System.out.println();
    }  
    }
    
  
}
