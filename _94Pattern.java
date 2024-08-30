public class _94Pattern {
    public static void main(String[] args) {
        int rows = 9;
    for(int i = 1; i <= rows; i++){
        for(int j =1; j <= 9; j++){
            if(i == 1 || j == 1 || i == rows || j == rows || i + j == 6 || j - i == 4 || i - j == 4 || i == 2 && j != 5 || i == 8 && j != 5 || i == 3 && i + j == 5 || i == 3 && j - i == 5 || i == 7 && j == 2 || i + j == 14 || i == 7 &&  j == 8){
                System.out.print("* ");
            } else{
                System.out.print("  ");
            }
}
System.out.println();
}
    }
}
