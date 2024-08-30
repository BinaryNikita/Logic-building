public class _106ReplaceStringChar {
    public static void main(String[] args) {
        String fruit = "banana";
        String f = "";
        for(int i =0; i < fruit.length(); i++){
            char newChar = fruit.charAt(i);
            if(newChar == 'a' ){
                newChar = 'o';
            } 
            f += newChar;
        }
        fruit = f;
        System.out.println(fruit);
    }
}
