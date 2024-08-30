
import java.util.Scanner; 
 public class _144RandomNumberGuessing 
{  
     
public static void main(String args[])   
{   
    Scanner sc = new Scanner(System.in);
    System.out.println("Guess the number");

    int number = sc.nextInt();
    
    double random = Math.floor(Math.random() * 10) + 1;
    while(number != random){
        System.out.println("Wrong number guess again");
        number = sc.nextInt();
        
        if(number > random ){
            System.out.println("Hint: The number greater than the actual number.");
        } else if(number < random) {
            System.out.println("Hint: The number is less than the actual number.");
        } else {
            System.out.println("You guessed the right number : "+ random);
        }
    }


  
}   
}  

