public class _208listOfCharacters {
    /*
     * Write a Java program to print a list of items containing all characters of a given word.
Sample Output:
The given strings are: rabbit   bribe   dog   
The given word is: bib 
The strings containing all the letters of the given word are: 

     */
public static void main(String[] args) {

    String fullStr = "rabbit   bribe   dog ";
    
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


         for(int i = 0; i < subStrings.length; i++){
             int same = 0;
             for(int k = 0; k < subStrings[i].length(); k++){
                char ch = subStrings[i].charAt(k);
                if(ch == 'b'){
                    same++;
                }
                if(ch == 'i'){
                    same++;
                }

            }

            if(same == 3){
                System.out.println(subStrings[i]);
            }
         }

        


}
}
