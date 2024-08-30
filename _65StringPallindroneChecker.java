public class _65StringPallindroneChecker {
    public static void main(String[] args) {
        String name = "madam";
        String rev = "";
        char newChar;

        for(int i = 0; i < name.length(); i++){
            newChar = name.charAt(i);
            rev = rev + newChar;         
        }

        int n = name.length() - 1; 
        int r = 0; 
        int count = 0;

        while( r < rev.length() && name.charAt(n) == rev.charAt(r)){
            count++;
            n--;
            r++;
        }

        if (count == name.length()) {
            System.out.println(name + " is a palindrome");
        } else {
            System.out.println(name + " is not a palindrome");
        }
    }
}

