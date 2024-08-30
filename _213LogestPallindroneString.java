public class _213LogestPallindroneString {
    /*
     * Write a Java program to find the longest Palindromic Substring within a string.
Sample Output:
The given string is: thequickbrownfoxxofnworbquickthe
The longest palindrome substring in the given string is; brownfoxxofnworb
The length of the palindromic substring is: 16
     */

     public static void main(String[] args) {
        String str = "thequickbrownfoxxofnworbquickthe";
        for (int i = 0; i <= str.length()/2; i++) { 
            String word = "";
            for (int j = 0; j < str.length()/2; j++) {
                char ch = str.charAt(i+j);
                word += ch;
            }
       System.out.println(word);
            String rev = "";
         char newChar;
 
         for(int d = 0; d < word.length(); d++){
             newChar = word.charAt(d);
             rev = rev + newChar;         
         }

         int n = word.length() - 1; 
        int r = 0; 
        int count = 0;

        while( r < rev.length() && word.charAt(n) == rev.charAt(r)){
            count++;
            n--;
            r++;
        }

        if (count == word.length()) {
            System.out.println(word + " is a palindrome");
        } else {
            continue;
        }
            }
        }
     }


