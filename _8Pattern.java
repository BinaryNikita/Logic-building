public class _8Pattern {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int j = rows; j >= i; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

 class Pattern7{
public static void main(String[] args) {
    char rows = 'E';
    for(char i = 'A'; i <= 'E'; i++){
        for(char j = rows; j >= i; j--){
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
 }