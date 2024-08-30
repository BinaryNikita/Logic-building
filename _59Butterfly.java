public class _59Butterfly {
    public static void main(String[] args) {
        int rows = 7;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows; j++){
                // System.out.print("* ");
                if(i == j || i+j == 8 || j ==                                                                                                                                                    1 && i %2 != 0|| j == 7 && i %2 != 0|| i == 4 && j == 2 || i == 4 && j == 6){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
