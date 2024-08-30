/*Two numbers are entered by the user, x and n. 
Write a function to find the value of one number 
raised to the power of another i.e. xn.
 */
public class _102Power {
    public static void main(String[] args) {
       int a = 9;
       int b = 3;
       int sum = 1;
       for(int i = 1; i<= b; i++){
         sum = sum*a;
       } 
       System.out.println(sum);
    }
}

 