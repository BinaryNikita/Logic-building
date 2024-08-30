public class _100PanagramString {
        public static void main(String[] args) {
            String sen = "The quick brown fox jumps over the lazy dog";
            boolean[] alphabet = new boolean[26]; 
            int count = 0;
    
            for (int i = 0; i < sen.length(); i++) {
                char currentChar = sen.charAt(i);
                if (currentChar >= 'a' && currentChar <= 'z') {
                    int index = currentChar - 'a'; 
                    if (!alphabet[index]) {
                        alphabet[index] = true;
                        count++;
                    }
                } else if (currentChar >= 'A' && currentChar <= 'Z') {
                    int index = currentChar - 'A';
                    if (!alphabet[index]) {
                        alphabet[index] = true;
                        count++;
                    }
                }
            }
    
            System.out.println(count);
        }
    }
    


class Demo{
    public static void main(String[] args) {
        String sen = "The quick brown fox jumps over the lazy dog";
        String alpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int count = 0;
        for (int i = 0; i < sen.length(); i++) {
            for (int j = 0; j < alpha.length(); j++) {
                if (sen.charAt(i) == alpha.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}



