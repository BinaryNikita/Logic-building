import java.util.Arrays;

public class _218RemoveElemt {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int ind, value, count;
        value = 2;
        count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
             count++;
            }
        }
        int[] newArr = new int[arr.length - count];
        ind = 0;
        for(int i = 0; i < arr.length; i++){
           if(arr[i] != value){
            newArr[ind++] = arr[i];
           }
        }

        System.out.println(Arrays.toString(newArr));
    }
}
