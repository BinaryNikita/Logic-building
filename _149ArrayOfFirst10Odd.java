public class _149ArrayOfFirst10Odd {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int ind = 0;
        for(int i = 0; i < 20; i++){
            if(i%2 != 0 && ind < arr.length){
                arr[ind] = i;
                ind++;
            }
        }
       for(int i = 0; i < arr.length; i++){
           System.out.println(arr[i]);
       }
    }
}
