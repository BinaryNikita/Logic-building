public class _171StringBalance {
    public static void main(String[] args) {
        String str = "(((()))";
        int opening = 0;
        int closing = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                opening++;
            }
            if(str.charAt(i) == ')'){
                closing++;
            }
        }
        if(opening == closing){
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
