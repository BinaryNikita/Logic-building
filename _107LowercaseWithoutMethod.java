public class _107LowercaseWithoutMethod {
    public static void main(String[] args) {
      String greet = "HELLO";
      String lower = "";
      for (int i = 0; i < greet.length(); i++) {
        char ch = greet.charAt(i);
        int asciiValue = ch;
        if (asciiValue >= 64 && asciiValue <= 90) {
          asciiValue += 32;
        }
        lower += (char) asciiValue;
      }
      System.out.println(lower);  
    }
  }
  