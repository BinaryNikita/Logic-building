public class _78Pattern {
    public static void main(String[] args) {
        int rows = 5;
        for(int  i= 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                if(i == 3 && j == 2 || (i == 4 && j == 2 || j == 3 ) ){
                    System.out.print(" ");
                } else{
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
