public class _151FirstElementGreaterThan20 {
    public static void main(String[] args) {
        // 45. Find the first element greater than 20 in the array [10, 20, 30, 40].

        int[] arr = {10, 20, 30, 40};
  

        for(int i: arr){
            if(i > 20){
                System.out.println(i);
                return;
                
            }
        }

    }
}
