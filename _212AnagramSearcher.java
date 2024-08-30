public class _212AnagramSearcher {
    public static void main(String[] args) {
        String[] arr = {"eat", "ate", "tea", "how", "who", "ohw"};

        //output: "eat", "ate", "tea"
                 //"how", "who", "ohw"
          
        for(int i = 0; i < arr.length; i++){
            int count  = 0; 
            for(int j = i + 1; j < arr.length; j++){
                for(int k = 0; k < arr[i].length(); k++){
                    for(int d = 0 ; d < arr[i].length(); d++){
                        if(arr[i].charAt(k) == arr[j].charAt(d)){
                            count++;
                        }
                    }
                }
                if(count == arr[j].length() && count == arr[i].length()){
                    System.out.println(arr[j]);
                }
            } 
        }
    }
}



/*String s1 = "abcd";
         String s2 = "dabc";
         int count = 0;
         
        
         for(int i = 0; i < s1.length(); i++){
           
             for(int j = 0; j < s2.length(); j++){
               
                if(s1.charAt(i) == s2.charAt(j)){
                    count++;
                } 
             }
               
               } 
               if(count == s1.length() && count == s2.length()){
                System.out.println("Anagram");
               } else {
                System.out.println("Not Anagram");
               } */
