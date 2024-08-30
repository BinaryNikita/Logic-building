
    
    class ReverseTriangle2{
        public static void main(String[] args) {
            int n = 5; 
            int i, j;
            for (i = n; i >= 1; i--) {
                for (j = i; j < n; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= i*2 - 1; k++) {
                System.out.print("* ");
                }
              
                    System.out.println();

                }
            }
    }

    
    class ReverseTriangle{
        public static void main(String[] args) {
            int n = 5; 
            int i, j;
            for (i = n; i >= 1; i--) {
                for (j = i; j < n; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= i*2 - 1; k++) {
                System.out.print(k + " ");
                }
              
                    System.out.println();

                }
            }
    }



        
class TrianglePattern3 {
            public static void main(String[] args) {
                int n = 5; 
                int i, j;
                for (i = 1; i <= n; i++) {
                    for (j = i; j < n; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print(i+ "   ");
                    }
                    System.out.println();
                }
            }
        }
class TrianglePattern4 {
            public static void main(String[] args) {
                int n = 5; 
                int i, j;
                for (i = 1; i <= n; i++) {
                    for (j = i; j < n; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print(k+ "   ");
                    }
                    System.out.println();
                }
            }
        }
        
        
class TrianglePattern5 {
            public static void main(String[] args) {
                int n = 5; 
                int i, j;
                for (i = 1; i <= n; i++) {
                    for (j = i; j < n+1; j++) {
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print(j+ "   ");
                    }
                    System.out.println();
                }
            }
        }
class TrianglePattern6 {
            public static void main(String[] args) {
                int n = 6; 
                int i, j;
                for (i = 1; i <= n; i++) {
                    for (j = n; j >= i; j--) {
                      
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print( "* ");
                    }
                    System.out.println();
                }
            }
        }

        




    class ReverseTriangle23{
        public static void main(String[] args) {
            int n = 5; 
            int i, j;
            for (i = n; i >= 1; i--) {
                for (j = i; j < n; j++) {
                    System.out.print("  ");
                }
                for (int k = i; k <= i*2 - 1; k++) {
                System.out.print(k + "   ");
                }
              
                    System.out.println();

                }
            }
    }
    class Triangle34{
        public static void main(String[] args) {
            int rows  = 3;
            for(int i = 1; i <= rows; i++){
                for(int j= 1; j <= 5; j++){
                    if(i+j == 4 || j - i == 2 || i == 3 || i == 2 && j == 3){
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
                }
            System.out.println();
                }
            
        }
    }
   
    
class TriangleRev{
    public static void main(String[] args) {
                

        int n = 5; 
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= i*2 - 1; k++) {
                System.out.print(k+ "   ");
            }
            System.out.println();
        }
    }
}
    
