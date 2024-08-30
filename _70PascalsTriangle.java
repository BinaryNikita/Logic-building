public class _70PascalsTriangle {
    public static void main(String[] args) {
        int n = 4; 
                int i, j;
                for (i = 1; i <= n; i++) {
                    for (j = i; j < n; j++) {
                      
                        System.out.print("  ");
                    }
                    for (int k = 1; k <= i; k++) {
                        if(k == 1 || i - k == 0  ){

                            System.out.print(1+ "   ");
                        } 
                        else {
                            System.out.print("    ");
                        }
                    } 
                    System.out.println();
                }
    }
}
