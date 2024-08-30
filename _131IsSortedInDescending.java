public class _131IsSortedInDescending {
    public static void main(String[] args) {
        int[] arr = {5, 5, 4, 3, 2, 1};  
        int max = arr[0];  
        int count = 0;

        for(int i: arr){
            if(max >= i){
              max = i;
              count++;
            }
        }

        if (count == arr.length) {
            System.out.println("It's sorted in descending order");
        } else {
            System.out.println("It's not sorted in descending order");
        }
    }
}
