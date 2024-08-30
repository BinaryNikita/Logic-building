public class _127BegginingArrayElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] arr2 = new int[4];
        int ind = 1;
        arr2[0] = 5;
        for(int i = 0; i < arr.length; i++){
            arr2[ind] = arr[i];
                ind++;
            }
            arr = arr2;
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
            }
    }
}
