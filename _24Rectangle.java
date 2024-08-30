class Rectangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class HollowRectangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows + 1; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows + 1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class HollowRectangle2 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows + 2; j++) {
                // System.out.print(" ");
                if (i == 1 || i == rows || j == 1 || j == rows + 2) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
            System.out.println(" ");
        }
    }
}
