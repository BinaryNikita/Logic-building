public class _214LongestSubstringWithoutRepeatedCharacter {
    /*
     * Write a Java program to find the length of the longest 
     * substring of a given string without repeating characters.
Sample Output:
Input String : pickoutthelongestsubstring
The longest substring : [u, b, s, t, r, i, n, g]
The longest Substring Length : 8

     */
    public static void main(String[] args) {
        String str = "pickoutthelongestsubstring";

        for(int i = 0; i < str.length()- 7; i++){
            String newStr = "";
            for(int j = 0; j < 8; j++){
               newStr += str.charAt(i+j);
            }

            int count = 0;
            for(int k = 0; k < newStr.length(); k++){
            for(int d = k ; d < newStr.length(); d++){
                if(newStr.charAt(k) == newStr.charAt(d)){
                    count++;
                }
            }
 
        }
        if(count == newStr.length()){
            System.out.println(newStr);
        }

        }
    }
}
