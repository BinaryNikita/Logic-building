public class _169ThirdLargest {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 1, 2, 3};
        int firstLargest = arr[0];
        int secondLargest = arr[0];
        int thirdlargest = arr[0];
        for(int a: arr){
            if(firstLargest < a){
                firstLargest = a;
            }
        }
        for(int b: arr){
            if(secondLargest < b && b < firstLargest ){
                secondLargest = b;
            }
        }

        for(int c: arr){
            if(thirdlargest < c && c < secondLargest && c < firstLargest){
                thirdlargest = c;
            }
        } 
        System.out.println(firstLargest);
        System.out.println(secondLargest);
      System.out.println(thirdlargest);

    }
}
