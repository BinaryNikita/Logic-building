public class _202ReplaceStringWord {
    public static void main(String[] args) {
        /*
         * Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
Sample string : "The quick brown fox jumps over the lazy dog."
In the above string replace all the fox with cat.
Sample Output:
Original string: The quick brown fox jumps over the lazy dog.                                                 
New String: The quick brown cat jumps over the lazy dog.     

         */

         String fullStr = "The quick brown fox jumps over the lazy dog.";
    
         int count = 0;
         for(int i = 0; i < fullStr.length(); i++){
             char ch = fullStr.charAt(i);
             if(ch == ' ' || ch == '.'){
                 count++;
             }
          
 
         }
         String[] subStrings = new String[count];
 
         int j = 0;
         String word = "";
         for(int i = 0 ; i < fullStr.length(); i++){
             char ch = fullStr.charAt(i);
             if(ch != ' ' && ch != '.'){
                 word += ch;
             } else {
                 subStrings[j] = word;
                 j++;
                 word = "";
             }
 
         }
 

        String newStr = ""; 
        for(int i = 0; i < subStrings.length; i++){
            if(subStrings[i].equals("fox")){
               subStrings[i] = "cat";
            }
            newStr += subStrings[i] + " ";
        }

        System.out.println(newStr);
         
                 
             }
         }
 
 
 
 

