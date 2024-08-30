public class _161RemoveVowels {
    public static void main(String[] args) {
        //Replace all vowels in the string "apple" with '*'.

        String str = "apple";
        String newStr = "";
        String vowels = "aeiouAEIOU";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            for(int j = 0; j < vowels.length(); j++){
                if(ch == vowels.charAt(j)){
                   ch = '*';
                }
            }
            newStr += ch;
        }

        str =  newStr;
        System.out.println(str);


    }
}
