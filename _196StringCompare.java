public class _196StringCompare {
    public static void main(String[] args) {
        String str1 = "Nikita Vishnoi";
        String str2 = "Nikita Vishnoi";
        int count = 0;

        if(str1.length() == str2.length()){
            for(int i = 0; i < str1.length(); i++){
                if(str1.charAt(i) == str2.charAt(i)){
                    count++;
                }
            }
        } else {
            System.out.println("Len is not same");
        }

        if(count == str1.length() && count == str2.length()){
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }

    }
}
