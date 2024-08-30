public class _191ArrayWithFibonacci {
    public static void main(String[] args) {
        // Create an array of the first 10 Fibonacci numbers.
        int[] arr = new int[10];
        int first = 0; 
        int second = 1;
        int next = 0;
       

        for(int i = 0 ; i < 10; i++){
            if(i <= 1){
                arr[i] = i;
            } else {

                next = first + second;
                first = second;
                second = next;
                arr[i] = second;
            }
            
            System.out.println(arr[i]);
        }
    }
}
