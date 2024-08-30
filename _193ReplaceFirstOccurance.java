public class _193ReplaceFirstOccurance {

        public static void main(String[] args) {
            String fruit = "banana";
            String f = "";
            int count = 0;
            for(int i =0; i < fruit.length(); i++){
                char newChar = fruit.charAt(i);
                if(newChar == 'a' && count < 1){
                    count++;
                    newChar = 'o';
                } 
                f += newChar;
            }
            fruit = f;
            System.out.println(fruit);
        }
    }
    
 class _193ReplaceFirstOccurance2 {

        public static void main(String[] args) {
            String fruit = "banana";
            String f = "";
            Boolean bool = false;
            for(int i =0; i < fruit.length(); i++){
                char newChar = fruit.charAt(i);
                if(newChar == 'a' && bool == false){
                    bool = true;
                    newChar = 'o';
                } 
                f += newChar;
            }
            fruit = f;
            System.out.println(fruit);
        }
    }
    

