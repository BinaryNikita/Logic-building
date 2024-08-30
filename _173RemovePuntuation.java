public class _173RemovePuntuation {
    public static void main(String[] args) {
        //Remove all punctuation from the string "Hello, World!".

        String str = "Hello, World!";
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            int ch = str.charAt(i);
            if(ch >= 33 && ch <= 47){
                continue;
            }
            newStr += (char)ch;
        }
        System.out.println(newStr);
    }
}
