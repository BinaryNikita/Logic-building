public class _160RemoveSpace {
    public static void main(String[] args) {
        //Remove all spaces from the string "Hello World".

        String str = "Hello World";
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                newStr += str.charAt(i);
            }
        }
         str = newStr;
System.out.println(str);
    }
}
