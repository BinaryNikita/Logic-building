public class _211ReplaceCharacter {
/*
 * "Write a Java program to replace a specified character with another character.
Sample Output:
Original string: The quick brown fox jumps over the lazy dog.                                                 
New String: The quick brown fox jumps over the lazy fog.
 */
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
             if(ch == 'd'){
                ch = 'f';
             }

             newStr += ch;
        }

        System.out.println(newStr);
    }
}


