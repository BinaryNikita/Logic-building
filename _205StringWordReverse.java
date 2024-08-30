public class _205StringWordReverse {
    /*
     * Write a Java program to reverse words in a given string.
     * Sample Output:
     * The given string is: Reverse words in a given string
     * The new string after reversed the words: string given a in words Reverse
     * 
     */
    public static void main(String[] args) {
        String str = "Reverse words in a given string.";
        String revStr = "";

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ' || ch == '.') {
                count++;
            }

        }
        String[] subStrings = new String[count];

        int j = 0;
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && ch != '.') {
                word += ch;
            } else {
                subStrings[j] = word;
                j++;
                word = "";
            }

        }
        for(int i = subStrings.length - 1; i >= 0; i--){
            revStr += subStrings[i] + " ";
        }

        System.out.println(revStr);
    }
}
