public class _81Pattern {
    public static void main(String[] args) {
        char rows = 'D';
       for(char i = 'A'; i <= rows; i++){
        for(char j = 'A'; j <= i; j++){
            if(i == j || j == 'A' || i == rows){
                System.out.print(j + " ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
       }
    }
}
