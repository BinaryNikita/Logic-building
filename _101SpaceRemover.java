public class _101SpaceRemover {
    public static void main(String[] args) {
        String name = "Nikita  Vishnoi";
        String r = "";
        char ch;
        for(int i = 0; i < name.length(); i++){
          ch = name.charAt(i);
          if(ch == ' ')
          continue;
          r = r + ch;
          
        }
        name = r;
        System.out.println(name);
    }
}
