public class _98StringRemoveDuplicate {
    public static void main(String[] args) {
        String name = "Aakansha";
        String rev = " ";
        for(int i = 0; i < name.length(); i++){
            char ch = name.charAt(i);
            if(ch  == 'a' || ch == 'A')
                continue;
            rev = rev + ch;
        }
        name = rev;
        System.out.println(name);
    }
}

class Duplicate{
    public static void main(String[] args) {
        String name = "Aakansha";
        String rev = " ";
        for(int i = 0; i < name.length(); i++){
            char ch = name.charAt(i);
            if(ch  != 'a' && ch != 'A'){
               rev = rev + ch;
            }
        }
        name = rev;
        System.out.println(rev);
    }
}