 class PrimeNumber {
public static void main(String[] args) {
    int num = 79;
    int count = 0; 
    for(int i = 2; i <= num; i++){
        if(num%i == 0){
            count++;
      }  
    } 
    if(count == 1){
        System.out.println("It's a prime number");
    } else {
        System.out.println("It's not a prime number");
    }
}
    
}