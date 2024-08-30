
public class _170ReplaceString {

    public static void main(String[] args) {
        String str = "My name is string";
        String[] strArray = str.split("\\s+");
        for(int i = 0; i < strArray.length; i++){
            if(strArray[i].equalsIgnoreCase("string")){
                strArray[i] = "Java";
            }
        }
        String newStr = "";
        for(int i = 0; i < strArray.length; i++){
            newStr += strArray[i] + " ";
        }

        System.out.println(newStr);
    }
}