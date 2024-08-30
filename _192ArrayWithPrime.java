public class _192ArrayWithPrime {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int ind = 0;
        for(int i = 2; i < 30; i++){
            int count = 0;
            for(int j = 2 ; j < 30; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 1){
                    arr[ind] = i;
                    ind++;
            }
        }

        for(int a: arr){
            System.out.println(a);
        }
    }
}
