public class _92Pattern {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows  ; i++){
            for(int j = 1; j <= rows; j++){
                if(i == 1 || i == 5 || j == 1 || j == 5  || i == j || i+j == 6){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
               
                
            }
            System.out.println();
        }
    }
}
