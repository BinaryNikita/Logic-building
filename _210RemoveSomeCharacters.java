public class _210RemoveSomeCharacters {
    public static void main(String[] args) {
//Write a Java program to remove "b" and "ac" from a given string.
// Sample Output:
// The given string is: abrambabasc
// After removing the new string is: aramaasc


String str = "abrambabasc";
String newStr = "";
for(int i = 0; i < str.length(); i++){
    if(str.charAt(i) != 'a' && str.charAt(i) != 'b' && str.charAt(i) != 'c'){
        newStr += str.charAt(i);
    }
}

System.out.println(newStr);

    }
}
