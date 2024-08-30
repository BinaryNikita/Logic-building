public class _197StringCompareIgnoreCase {
    public static void main(String[] args) {
        String str1 = "This is string";
        String str2 = "this is String";
        int count = 0;
        if(str1.length() == str2.length()){
        for(int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == str2.charAt(i)){
                count++;
            }
            int ch = str1.charAt(i);
            int ch2 = str2.charAt(i);
            
            if((ch + 32) == ch2){
                count++;
            }
            if((ch - 32) == ch2){
                count++;
            }
            }
        } else {
            System.out.println("Lengths are not same");
        }
      
        if(count == str1.length() && count == str2.length()){
           System.out.println("Same");
        } else {
            System.out.println("Character are not same");
        }

        }
    }

