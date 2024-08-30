public class _172MostFrequentCharacter {
    public static void main(String[] args) {
        String str = "testtt";
        char ch = ' ';
        int max = 0;
        int count = 0;
        for(int i = 0 ; i < str.length(); i++){
            count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                  count++;
                }
                max = 0;
                if(count > max){
                    max = count; 
                    ch = str.charAt(i);
                }
            } 
        }
      System.out.println("The most frequesnt character is: " + ch);
    }
}
