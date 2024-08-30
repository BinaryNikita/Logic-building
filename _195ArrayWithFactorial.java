public class _195ArrayWithFactorial {
    public static void main(String[] args) {
        int[] arr = new int[5]; 
        int fact = 1;
        int ind = 0;
        for(int i = 1; i <= 5; i++){
             fact *= i;
             arr[ind] = fact;
             System.out.println(arr[ind]);
            }
            ind++;

    }
}
