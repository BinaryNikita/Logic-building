public class _128RemoveFirstElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        int[] arr2 = new int[arr.length-1];
        int ind = 0;
        for(int i = 1; i < arr.length; i++){
            arr2[ind] = arr[i];
            ind++;
        }
        arr = arr2;

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

      
    }
}
