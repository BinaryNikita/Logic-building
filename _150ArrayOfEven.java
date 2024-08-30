public class _150ArrayOfEven {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int ind = 0;
        for(int i = 1; i <= 22; i++){
            if(i%2 == 0 && ind < arr.length){
                arr[ind] = i;
                ind++;
            }
        }
       for(int i = 0; i < arr.length; i++){
           System.out.println(arr[i]);
       } 
    }
}
