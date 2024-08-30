public class _96StringNumberChecker {
    public static void main(String[] args) {
        String num = "1234";
        char ch ;
        int count = 0;
        int n = 0;
        for(int i = 0; i < num.length(); i++){
            ch = num.charAt(i);
            if(ch <= '9' && ch > '-' ){
               count++;
               
               }
        }
        if(num.length() == count){
            System.out.println("Its a valid number:" + num);

        } else {
            System.out.println("Its not a valid number");
        }
    }
}
