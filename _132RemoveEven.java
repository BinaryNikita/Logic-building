public class _132RemoveEven {
    public static void main(String[] args) {
    //Remove all even numbers from the array [1, 2, 3, 4, 5, 6].
        int[] arr = {1, 2, 3, 4, 5, 6};
        int len = 0;
        System.out.println("Original array");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
            if(arr[i]%2 != 0){
                len++;
            }
        }
        int ind = 0;
        int[] oddArr = new int[len];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 != 0){
                oddArr[ind] = arr[i];
                ind++;
            }
        }
        arr = oddArr;
        System.out.println("New array with odd numbers only.");
     for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i] + " ");
     }
 


        
    }
}
