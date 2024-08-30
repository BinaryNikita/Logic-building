public class _209ReverseOnlysubstrings {
    public static void main(String[] args) {
//Write a Java program to reverse every word in a string using methods.
// Sample Output:
// The given string is: This is a test string
// The string reversed word by word is: 
// sihT si a tset gnirts

String fullStr = "This is a test string.";

    
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
                 word = ch + word;
             } else {
                 subStrings[j] = word;
                 j++;
                 word = "";
             }
 
         }
String revStr = "";
         for(String s: subStrings){
          revStr += s + " ";
         }

         System.out.println(revStr);

    }
}
