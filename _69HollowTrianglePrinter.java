 class _69HollowTrianglePrinter {

    public static void main(String[] args) {
        int rows = 5; 
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
    if (k == 1 || i == 2 && k == 2 ||i == 3 && k != 2 || i == 4 && k == 4 || i == 5 ) { 
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(); 
    }
}}
