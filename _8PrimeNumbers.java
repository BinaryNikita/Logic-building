 class PrimeNumbers {
    public static void main(String[] args) {
        int j;
        int i;
        for(i = 1; i <= 10; i++){
            for(j = 2; j <= 10; j++){
                if(i%j == 0){
                   break;
                }
            } 
            if(i == j){
                System.out.println(j);
            }
        }
    }
    
}
