public class _109IndexFinding {
    public static void main(String[] args) {
        String name = "Nikita";
        int index = 0;
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == 'i'){
                index = i;
            }
        }
        System.out.println(index);
    }
}
class IndexFinding {
    public static void main(String[] args) {
        String name = "Nikita";
        int index = 0;
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) == 'i'){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
