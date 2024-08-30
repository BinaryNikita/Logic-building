public class _119StringtoFloat {
    public static void main(String[] args) {
        // Convert the string "3.14" to a float.
        String num = "3.14";
        float n= 0;
        for(int i = 0; i < num.length(); i++){
            char ch = num.charAt(i);
            n = n * 10 + (ch - '0');
        }
        System.out.println(n);
    }
}
 