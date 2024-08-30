public class _167StringMethod {

    static Boolean mySubSTring(String str, String subString) {
        Boolean stringExist = false;
        for (int i = 0; i <= str.length() - subString.length(); i++) { 
            String word = "";
            for (int j = 0; j < subString.length(); j++) {
                char ch = str.charAt(i+j);
                word += ch;
            }

            int count = 0;
            for (int k = 0; k < subString.length(); k++) {
                char s = subString.charAt(k);
                char w = word.charAt(k);
                if (s == w) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == subString.length()) {
                stringExist = true;
                break; 
            }
        }
        return stringExist;
    }

    public static void main(String[] args) {
        System.out.println(mySubSTring("Listen", "en"));   
        System.out.println(mySubSTring("Listen", "List")); 
        System.out.println(mySubSTring("Listen", "is"));   
        System.out.println(mySubSTring("Listen", "ten"));  
        System.out.println(mySubSTring("Listen", "Lis"));  
    }
}





class StringMethod {

    static Boolean mySubSTring(String str, String subString) {
        for (int i = 0; i <= str.length() - subString.length(); i++) {
            int count = 0;
            for (int j = 0; j < subString.length(); j++) {
                if (str.charAt(i + j) == subString.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == subString.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(mySubSTring("Listen", "en"));  
        System.out.println(mySubSTring("Listen", "List")); 
        System.out.println(mySubSTring("Listen", "is"));   
        System.out.println(mySubSTring("Listen", "ten"));  
        System.out.println(mySubSTring("Listen", "Lis"));  
    }
}
