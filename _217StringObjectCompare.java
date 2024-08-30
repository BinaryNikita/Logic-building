public class _217StringObjectCompare {
    public static void main(String[] args) {
                String str1 = new String("Stephen Edwin King");
                String str2 = new String("Walter Wincell");
                int count = 0;
                  
                if(str1.length() != str2.length()){
                    System.out.println("Not same");
                } else {

                    for(int i = 0; i < str1.length(); i++){
                        if(str1.charAt(i) == str2.charAt(i)){
                            count++;
                        }
                    }
                    if(count == str1.length() && count == str2.length()){
                        System.out.println("Same");
                    } else {
                        System.out.println("Not same");
                    }
                }

                
        
            }
        
}

