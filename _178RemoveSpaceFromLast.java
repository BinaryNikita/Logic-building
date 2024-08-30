public class _178RemoveSpaceFromLast {
    public static void main(String[] args) {
        String str = "Hello World ";
        int ind = str.length() - 1;
        String newStr = "";
        
        for(int i = 0; i < str.length(); i++){
            if(i < ind){
                newStr += str.charAt(i);
              }
        }
        System.out.println(newStr);

    } 
    }

