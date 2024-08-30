public class _93Pattern {
  public static void main(String[] args) {
    int rows = 5;
    for(int i = 1; i <= rows; i++){
        for(int j =1; j <= 9; j++){
            if(i == 5 || j == 1 || i == j || i+j == 10 || j == 9 || i == 4 && j != 5 || i == 3 &&  i + j == 5 || i == 3 && j - i == 5){
                System.out.print("* ");
            } else{
                System.out.print("  ");
            }
}
System.out.println();
}
  }
}
