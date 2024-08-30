public class _82Pattern {
    public static void main(String[] args) {
        char rows = 5;
        char ch = 'a';
    for(char i = 1; i <= rows; i++){
     for(char j = 1; j <= i; j++){
         if(i == j || j == 1 || i == rows){
             System.out.print(ch + " ");
             ch++;
         } else {
             System.out.print("  ");
         }
     }
     System.out.println();
    }
    }
}
