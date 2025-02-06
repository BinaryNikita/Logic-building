class Main {
    public static void main(String[] args) {
        int rows = 5;
        int upper = (rows + 1) / 2;  
        for (int i = 1; i <= rows; i++) {
            int spaces = (i <= upper) ? rows - i : i - 1;
            int stars = (i <= upper) ? i : rows - i + 1;

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
