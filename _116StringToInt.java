public class _116StringToInt {
    public static void main(String[] args) {
        String num = "100";
        int n = 0;
        for(int i = 0; i < num.length(); i++){
            char ch = num.charAt(i);
            n = n * 10 + (ch - '0');
        }

        System.out.println(n);

    }
}
