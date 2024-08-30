public class _212SwapLastTwo {
    public static void main(String[] args) {
/* Write a Java program to create a string from a given 
string by swapping the last two characters of the given 
string. The string length must be two or more.
Sample Output:
The given strings is: string
The string after swap last two characters are: strign */

String str = "String";
String newStr = "";
for(int i = 0; i < str.length(); i++){
    if(i < str.length() - 2){
        newStr += str.charAt(i);
    }
    if(i == str.length() - 2){
        newStr += str.charAt(str.length() - 1);
    }
    if(i == str.length() - 1){
        newStr += str.charAt(str.length() - 2);
    }
}

System.out.println(newStr);


    }
}
