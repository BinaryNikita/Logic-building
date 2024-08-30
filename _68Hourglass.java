class Hourglass3{
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int j =1; j <= rows; j++){
                if(i == 1 || i == 5 || j == i || i+j == 6 ){
                        System.out.print( j + " ");   

                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


public class _68Hourglass {
public static void main(String[] args) {
    int rows = 5;
    for(int i = 1; i <= rows; i++){
        for(int j =1; j <= rows; j++){
            if(i == 1 || i == 5 || j == i || i+j == 6 || j == 3){
                   System.out.print(j + " ");
            } else{
                System.out.print("  ");
            }
        }
        System.out.println(" ");
    }
}
    
}