 public class _300SubstringChecker {
  public static void main(String args[]) {
    String str = "Listen";
    String subString = "List";

    for (int i = 0; i <= str.length() - subString.length(); i++) {
      String word = "";
      for (int j = 0; j < subString.length(); j++) {
        char ch = str.charAt(i + j);
        word += ch;
      }

      int count = 0;
      for (int k = 0; k < word.length(); k++) {
        if (word.charAt(k) == subString.charAt(k)) {
          count++;
        }

      }
      if (count == word.length()) {
        System.out.println("Yes it contains " + subString);
      } 
    }
  }

}