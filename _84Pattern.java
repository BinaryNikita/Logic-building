public class _84Pattern {
    public static void main(String[] args) {
        int rows = 5;
    for(int i = 1; i <= rows; i++){
       for(int j = 1; j <= rows; j++){
        if(i%2 != 0 ){
            System.out.print("* ");
        }
        if(i%2 == 0){
            System.out.print(" *");
        }
       
       } 
       System.out.println();
    }
}
}