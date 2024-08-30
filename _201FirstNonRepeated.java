public class _201FirstNonRepeated {
    public static void main(String[] args) {
        /*
         * Write a Java program to find the first non-repeating character in a string.
Sample Output: The given string is: gibblegabbler
The first non repeated character in String is: i
         */

         String str = "gibblegabbler";
         Boolean bool = false;
         for(int i = 0; i < str.length(); i++){
             int count = 0;
         for(int j = 0; j < str.length(); j++){
               if(str.charAt(i) == str.charAt(j) ){
                   count++;
               }
         }

         if(count == 1 && bool == false){
              bool = true;
              System.out.println(str.charAt(i));
         }
         

    }


}
}