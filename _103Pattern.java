public class _103Pattern {
    public static void main(String[] args) {
        int rows = 9;
        int col = 5;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= col; j++){
                if(i == j || i + j == 10 || j == 1 || j < i && i < 6 || i == 6 && j < col ||  i == 7 && j < col-1 || i == 8 && j == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
class Demo2 {
    public static void main(String[] args) {
        int rows = 5 ;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();        
    }
    for(int i = rows-1; i >= 1; i--){
        for(int j = 1; j <= i; j++){
            System.out.print("* ");
        }
        System.out.println();        
}

}
}