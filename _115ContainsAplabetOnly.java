 public class _115ContainsAplabetOnly {
    public static void main(String[] args) {
        String str = "Abc123";
        int len = str.length();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char newChar = str.charAt(i);
            if(newChar >= 'A' && newChar <= 'Z' || newChar >= 'a' && newChar <= 'z' ){
               count++;
            }

        }

        if(len == count){
            System.out.println("String contains all alphabet");
        } else {
            System.out.println("String does'nt contain all alphabet");
        }
    }
}
