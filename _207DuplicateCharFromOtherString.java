public class _207DuplicateCharFromOtherString {
    public static void main(String[] args) {
        String str1 = "the quick brown fox";
        String str2 = "queen";
        String newStr = "";


        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            boolean isDuplicate = false;

            for (int j = 0; j < str2.length(); j++) {
                if (ch == str2.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate == false) {
                newStr += ch;
            }
        }

    
        System.out.println(newStr);
    }
}
