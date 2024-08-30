

public class _159SubstringFinder {
    public static void main(String[] args) {
        String fullStr = "This is full String.";
    
        int count = 0;
        for(int i = 0; i < fullStr.length(); i++){
            char ch = fullStr.charAt(i);
            if(ch == ' ' || ch == '.'){
                count++;
            }
         

        }
        String[] subStrings = new String[count];

        int j = 0;
        String word = "";
        for(int i = 0 ; i < fullStr.length(); i++){
            char ch = fullStr.charAt(i);
            if(ch != ' ' && ch != '.'){
                word += ch;
            } else {
                subStrings[j] = word;
                j++;
                word = "";
            }

        }

        for(String words : subStrings){
            System.out.println(words);
        }
        
                
            }
        }



