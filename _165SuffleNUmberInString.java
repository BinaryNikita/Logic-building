public class _165SuffleNUmberInString{
    
public static void main(String args[]){
//Convert the string "123abc456" to "456abc123".
String origiString = "123abc456";
String suffString = "";
String part1 = "";
String part2 = "";
String mid = "";
for(int i = 0; i < origiString.length(); i++){
    int ch = origiString.charAt(i);
   if(ch >= 48 && ch < 52){
        part2 += (char) ch;
   }
      else if(ch >= 52 && ch < 57){
        part1 += (char) ch;
       } else {
         mid += (char) ch;
       }  
      }

      suffString = part1 + mid + part2;
System.out.println(suffString);
}
}


 