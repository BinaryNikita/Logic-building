public class _139ReplaceVowel {
    public static void main(String[] args) {
//32. Replace all vowels in the string "apple" with '*'.

        String str = "apple";
        String newStr = "";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u'){
                ch = '*';
            }
            newStr = ch + newStr;
        }   
        System.out.println(newStr);
    }
}
