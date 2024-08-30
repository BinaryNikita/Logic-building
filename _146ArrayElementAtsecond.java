public class _146ArrayElementAtsecond {

    public static void main(String[] args) {
        int[] arr = {16, 17,18};
        int[] arr2 = new int[arr.length+1];
        for(int i = 0; i < arr2.length; i++){
            if(i < 2){
                arr2[i] = arr[i];
            }
            else if(i == 2){
                arr2[i] = 12;  
            } else {
                arr2[i] = arr[arr.length-1];
            }
            System.out.println(arr2[i]);
    }
}
}