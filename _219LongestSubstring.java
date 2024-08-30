public class _219LongestSubstring {
    public static void main(String[] args) {
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
                 word += ch ;
             } else {
                 subStrings[j] = word;
                 j++;
                 word = "";
             }
         }

         int len = 0;
         String longestSubstring = "";
         for(int i = 0; i < subStrings.length; i++){
            len = 0;
            for(int k = 0; k < subStrings[i].length(); k++){
                len++;
            }
            int max = len;
            if(len > max){
                max = len;
                longestSubstring = subStrings[i];
            }
         }
         System.out.println(longestSubstring);

    }
}
