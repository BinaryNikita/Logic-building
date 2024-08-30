public class _177RemoveSpaceFromFront {
    public static void main(String[] args) {
        String str = " Hello World.";
        int ind = 0;
        String newStr = "";

        for(int i = 0; i < str.length(); i++){
            if(i > ind){
                newStr += str.charAt(i);
              }
        }
        System.out.println(newStr);
    }
}
