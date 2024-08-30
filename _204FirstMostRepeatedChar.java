public class _204FirstMostRepeatedChar {
    /*
     * Write a Java program to find the character in a string that occurs the most
     * frequently.
     * Sample Output:
     * The given string is: test string
     * Max occurring character in the given string is: t
     * 
     */
    public static void main(String[] args) {

        String str = "test string";

        char mostFrequentChar = ' ';
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    mostFrequentChar = str.charAt(i);
                }
            }
        }

        System.out.println(mostFrequentChar);
    }
}
