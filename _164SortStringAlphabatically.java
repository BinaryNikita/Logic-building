

public class _164SortStringAlphabatically {

    public static void main(String[] args) {
        String input = "hello";
        char[] charArray = input.toCharArray();
        int length = charArray.length;
        String sortedInput = "";

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (charArray[j] < charArray[i]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
            sortedInput += charArray[i];
        }
        System.out.println(sortedInput);
    }

}
