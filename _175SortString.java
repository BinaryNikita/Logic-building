public class _175SortString {
    public static void main(String[] args) {
        //Sort the words in the string "banana apple cherry" alphabetically.
         String str = "banana apple cherry abble";
         String[] strArray = str.split("\\s+");
         String newStr = "";
         for(int i = 0; i < strArray.length; i++){
         for(int j = i + 1; j < strArray.length; j++){
  if(strArray[i].compareTo(strArray[j]) > 0){
                String temp = strArray[i];
                strArray[i] = strArray[j];
                strArray[j] = temp;
             }
         }
    }
  for(String s: strArray){
    newStr += s + " ";
  }
   str = newStr;
System.out.println(str);

}

}