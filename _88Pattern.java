public class _88Pattern {

    public static void main(String[] args) {
        char rows = 'E';
    for(char i = rows; i >= 'A'; i-- ){
     for(char j = 'A'; j <= i; j++){
             if(i == j || i == 'E' || j == 'A'){

                 System.out.print(j + " ");
             } else {
                System.out.print(" ");
             }

       
     }
     System.out.println();
    }
    }
}
