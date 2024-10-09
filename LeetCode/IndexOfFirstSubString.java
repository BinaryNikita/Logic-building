package LeetCode;



public class IndexOfFirstSubString {

    public static int indexOfSubstring(String str, String sub){
  
        int index = -1; 

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            boolean found = true; 

            for (int j = 0; j < sub.length(); j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    found = false; 
                    break; 
                }
            }

            if (found) {
                index = i; 
                break; 
            } 
        }

return index;
    }
    public static void main(String[] args) {
      System.out.println(indexOfSubstring("Nikita", "kit"));
    }
}
