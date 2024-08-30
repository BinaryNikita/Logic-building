class ZeroOneTriangle{
    public static void main(String[] args) {
        int rows = 4;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                int sum = i + j;
             
                if(sum % 2 == 0){
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }

            }
          
        System.out.println();
        }
    }
}
class ZeroOneTriangle2{
    public static void main(String[] args) {
        int rows = 4;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                int sum = i + j;
                int mod = sum % 2;
                System.out.print(mod + " ");
               
 
            }
          
        System.out.println();
        }
    }
}