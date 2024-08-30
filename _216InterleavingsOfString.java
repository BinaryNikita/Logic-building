import java.util.HashSet;
import java.util.Set;

public class _216InterleavingsOfString {
    /*
     * Write a Java program to find all interleavings of given strings.
Sample Output:
The given strings are: WX  YZ
The interleavings strings are: 
YWZX
WYZX
YWXZ
WXYZ
YZWX
WYXZ

     */
    public static void main(String[] args) {
        String str = "WX YZ";
        int len = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                len++;
            }
        }

        char[] ch = new char[len];
        int ind = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                ch[ind] = str.charAt(i);
                ind++;
            }
        }


        for(int i = 0; i < ch.length; i++){
            String newStr = "";
            for(int j = 0 ; j < ch.length; j++){
                if(ch[i] > ch[j]){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
                if(i == 0 && ch[i] == 'W' || i == 0 && ch[i] == 'X') {
                    newStr += ch[j];
                }
                
            }
            System.out.println(newStr);
            // if(ch[i] == ch[j]){
            //             char temp = ch[i];
            //             ch[i] = ch[j];
            //             ch[j] = temp;
            //         }
            //         newStr += ch[j];
            // newStr = "";
            // for(int j = 0 ; j < ch.length; j++){
            //     if(ch[i] == ch[j]){
            //         char temp = ch[i];
            //         ch[i] = ch[j];
            //         ch[j] = temp;
            //     }
            //     newStr += ch[j];
            // }
            // System.out.println(newStr);

        }
        
    }
}



 class InterleavingStrings {

    public static void main(String[] args) {
        String str1 = "WX";
        String str2 = "YZ";

        System.out.println("The given strings are: " + str1 + "  " + str2);
        System.out.println("The interleavings strings are: ");
        Set<String> interleavings = getAllInterleavings(str1, str2);

        for (String interleave : interleavings) {
            System.out.println(interleave);
        }
    }

    public static Set<String> getAllInterleavings(String str1, String str2) {
        Set<String> result = new HashSet<>();
        findInterleavings(str1, str2, "", result);
        return result;
    }

    private static void findInterleavings(String str1, String str2, String interleaved, Set<String> result) {
        if (str1.length() == 0 && str2.length() == 0) {
            result.add(interleaved);
            return;
        }

        if (str1.length() > 0) {
            findInterleavings(str1.substring(1), str2, interleaved + str1.charAt(0), result);
        }

        if (str2.length() > 0) {
            findInterleavings(str1, str2.substring(1), interleaved + str2.charAt(0), result);
        }
    }
}

 class InterleavingsOfString {

    public static void main(String[] args) {
        String str1 = "WX";
        String str2 = "YZ";

        System.out.println("The given strings are: " + str1 + "  " + str2);
        System.out.println("The interleavings strings are: ");
        printInterleavings(str1, str2, "", 0, 0);
    }

    public static void printInterleavings(String str1, String str2, String interleaved, int i, int j) {
        // Base case: If both strings are empty, print the interleaved string
        if (i == str1.length() && j == str2.length()) {
            System.out.println(interleaved);
            return;
        }

        // If there are remaining characters in str1, add the next character to the interleaved string
        if (i < str1.length()) {
            printInterleavings(str1, str2, interleaved + str1.charAt(i), i + 1, j);
        }

        // If there are remaining characters in str2, add the next character to the interleaved string
        if (j < str2.length()) {
            printInterleavings(str1, str2, interleaved + str2.charAt(j), i, j + 1);
        }
    }
}
