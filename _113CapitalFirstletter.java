public class _113CapitalFirstletter {
    public static void main(String[] args) {
        String str = "python";
        String str1 = "";
        for(int i = 0; i < str.length(); i++){
            char newChar = str.charAt(i);
            if(i == 0){
                newChar -= 32;
            }
            str1 += newChar;
        }
        System.out.println(str1);
    }
}
