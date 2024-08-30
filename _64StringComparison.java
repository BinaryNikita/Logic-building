public class _64StringComparison {
    public static void main(String[] args) {
       String name = "test";
       String name2 = "Test";
       int count = 0;
       int n = 0;
       

   
       if (name.length() != name2.length()) {
           System.out.println("Not same");
       }
   
       while (n < name.length()) {
           if (name.charAt(n) == name2.charAt(n)) {
               count++;   
           }                                        
           n++;
       }

       if(count == name.length()){
        System.out.println("Same");
       } else {
        System.out.println("Not same");
       }
   
    }
   }
   