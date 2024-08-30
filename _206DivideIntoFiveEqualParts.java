public class _206DivideIntoFiveEqualParts {
    /*
     * The given string is: abcdefghijklmnopqrstuvwxy
The string divided into 5 parts and they are: 
abcde
fghij
klmno
pqrst
uvwxy

     */
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxy";
        int ind = 0;
        for(int i = 0; i < 5; i++){
              String words = "";
          for(int j = 0; j < 5; j++){
            if(ind < str.length()){
                words += str.charAt(ind);
                ind++;
            }
            }
System.out.println(words);
        }

    }

}