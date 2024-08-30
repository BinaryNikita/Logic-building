public class _108Uppercase {
    public static void main(String[] args) {
        String greet = "hello";
        String lower = "";
        for (int i = 0; i < greet.length(); i++) {
          char ch = greet.charAt(i);
          int asciiValue = ch;
          if (asciiValue >= 97 && asciiValue <= 122) {
            asciiValue -= 32;
          }
          lower += (char) asciiValue;
        }
        System.out.println(lower);   
    }
}
