
public class _129_1To5Array {
    public static void main(String[] args) {
     
        int[] arr = new int[5];
        int index = 0;
        for(int i = 1; i <= arr.length; i++){
            arr[index] = i;
            index++;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
