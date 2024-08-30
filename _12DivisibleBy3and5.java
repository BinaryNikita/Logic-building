class DivisibleBy3and5 {
    public static void main(String[] args) {
        for(int i = 1; i <= 50; i++){
            if(i%3 == 0){
                System.out.println("By 3 " + i);
            }  
        }
        System.out.println();
        for(int i = 1; i <= 50; i++){
            if(i%5 == 0){
                System.out.println("By 5 " + i);
            }  
        }
        System.out.println();
        for(int i = 1; i <= 50; i++){
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("By 3 and 5 " + i);
            }  
        }
        
    }
    
}
