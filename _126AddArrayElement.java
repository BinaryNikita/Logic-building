public class _126AddArrayElement {
    /*6. Add an element to the end of the array [1, 2, 3]. */
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = new int[4];
        int ind = 0;
        for(int i = 0; i < arr.length; i++){
            arr2[ind] = arr[i];
                ind++;
            }
                arr2[3] = 5;
                arr = arr2;
            
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
       

    }
}
