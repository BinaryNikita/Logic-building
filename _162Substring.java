public class _162Substring {
    //Check if the string "OpenAI" contains the substring "AI".

    public static void main(String[] args) {
        String str = "OpenAI";
        int indexOfA = 0;
        int indexOfI = 0;
        for(int i = 0; i < str.length(); i++){
            char ch =  str.charAt(i);
            if(ch == 'A'){
            indexOfA = i;
            }
            if(ch == 'I'){
                indexOfI = i;
            }
             
        }

        if(indexOfA + 1 == indexOfI){
            System.out.println("Yes it is a substring");
        } else {
            System.out.println("It's not a substring");
        }
    }
}
