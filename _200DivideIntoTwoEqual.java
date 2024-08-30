 public class _200DivideIntoTwoEqual{
    public static void main(String[] args) {
        String originalStr = "Nikita Vishnoi";
        String first = "";
        String second = "";
        for(int i = 0; i < originalStr.length(); i++){
            if(i < originalStr.length()/2) {
                first += originalStr.charAt(i);
            }
            if(i >= originalStr.length()/2) {
                second += originalStr.charAt(i);
            }
        }

        System.out.println(first);
        System.out.println(second);
    }
 }