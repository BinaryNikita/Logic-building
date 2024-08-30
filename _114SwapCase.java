public class _114SwapCase {
    public static void main(String[] args) {
        String lang = "PyTHOn";
        String lang2 = "";
        for(int i = 0; i < lang.length(); i++ ){
            char newChar = lang.charAt(i);
            int ascii = newChar;
            if (ascii >= 97 && ascii <= 122) {
                ascii -= 32;
              }
            else if (ascii >= 65 && ascii <= 90) {
                ascii += 32;
              }

            lang2 += (char) ascii;
        }
        System.out.println(lang2);

    }
}
