public class _152LastElementLessThan50 {
   public static void main(String[] args) {
    // 46. Find the last element less than 50 in the array [60, 50, 40, 30].

    int[] arr = {60, 50, 40, 30};

    for(int i = arr.length-1; i >=0; i--){
        if(arr[i] < 50){
            System.out.println(arr[i]);
            break;
        }
    }
    
   } 
}
