public class _300{
    public static void main(String args[]){
       String str = "ChatGPT";
       String subString = "GPT";

       for (int i = 0; i <= str.length() - subString.length(); i++) { 
        String word = "";
        for (int j = 0; j < 3; j++) {
            char ch = str.charAt(i+j);
            word += ch;
        }
      System.out.println(word);
      
    }
}

}