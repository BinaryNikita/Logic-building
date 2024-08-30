public class _112SpaceAterCharacter {
    public static void main(String[] args) {
        String string = "Open";
        String newString = "";
        for(int i = 0; i < string.length(); i++){
            char newChar = string.charAt(i);
            newString += newChar + " ";
        }

        System.out.println(newString);
    }
}
