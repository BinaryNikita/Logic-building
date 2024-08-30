public class _110ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
      int count = 0;
      int n = num;   
      int originalNumber = num;  
      while (num != 0) {
          count++;
          num /= 10;
        }

      int rem;
      int sum = 0;
      while(n != 0){
          rem = n%10;
          int power = 1;
        for(int i = 0; i < count; i++){
            power *= rem;
        }
        sum += power;
        n /= 10;
      }

      if(originalNumber == sum){
        System.out.println("It's a armstrong number.");
      } else {
        System.out.println("It's not a armstrong number.");
      }



    }


}
