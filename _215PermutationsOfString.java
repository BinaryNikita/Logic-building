public class _215PermutationsOfString {
    public static void main(String[] args) {
     /*  Write a Java program to print all permutations of a given string with repetition.
Sample Output:
The given string is: PQR
The permuted strings are:
PPP
PPQ
PPR
...
RRP
RRQ
RRR
*/  

String str = "PQR";
int len = str.length();
char[] ch = new char[len];
for(int i = 0; i < str.length(); i++){
        ch[i] = str.charAt(i);
}
String newStr = "";
for(int i = 0; i < ch.length; i++){
    newStr = "";
   for(int j = 0 ; j < ch.length; j++){
       if(ch[i] < ch[j]){
           char temp = ch[i];
           ch[i] = ch[j];
           ch[j] = temp;
        }
        newStr += ch[i];
   }
   System.out.println(newStr);
   newStr = "";
   for(int k = 0 ; k < ch.length; k++){
       if(ch[i] > ch[k]){
           char temp = ch[i];
           ch[i] = ch[k];
           ch[k] = temp;
        }
        newStr += ch[i];
   }
   System.out.println(newStr);

   newStr = "";
   for(int k = 0 ; k < ch.length; k++){
       if(ch[i] != ch[k]){
           char temp = ch[i];
           ch[i] = ch[k];
           ch[k] = temp;
        }
        newStr += ch[i];
   }
   

   System.out.println(newStr);
}

    }

}
