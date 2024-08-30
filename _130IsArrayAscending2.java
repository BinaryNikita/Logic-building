

public class _130IsArrayAscending2{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5};

        int min = arr[0];
        int count = 0;
        for(int i: arr){
            if(min <= i){
              min = i;
              count++;
            }
        }
     if(count == arr.length){
        System.out.println("It's sorted in ascending order");
     } else {
        System.out.println("It's not sorted in ascending order");
     }
    }
}
