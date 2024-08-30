public class _174UniqueCharacters {

    public static void main(String[] args) {
        //Check if the string "level" contains all unique characters.

        String str = "lie";
        int countUnique = 0;
        for(int i = 0; i < str.length(); i++){
            int countOne = 0;
          for(int j = 0; j < str.length(); j++){
            if(str.charAt(i) == str.charAt(j)){
              countOne++;
            }
          }
          if(countOne == 1){
            countUnique++;
          }

        }
        if(countUnique == str.length()){
          System.out.println("All charcaters are unique.");
        } else {
          System.out.println("All characters are not unique");
        }
    }
}

 class UniqueCharacters {

    public static void main(String[] args) {
        // Check if the string "little" contains all unique characters.

        String str = "EheE";
        boolean allUnique = true;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    allUnique = false;
                    break;
                }
            }
            if (!allUnique) {
                break;
            }
        }

        if (allUnique) {
            System.out.println("All characters are unique.");
        } else {
            System.out.println("All characters are not unique.");
        }
    }
}
