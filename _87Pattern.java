public class _87Pattern {
    public static void main(String[] args) {
        char rows = 5;
        char ch = 'a';
    for(char i = 1; i <= rows; i++){
     for(char j = rows; j >= i; j--){
   
             System.out.print(ch + " ");
             ch++;
       
     }
     System.out.println();
    }
    }
}
