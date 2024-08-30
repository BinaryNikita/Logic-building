public class _141IndexOfElement {
public static void main(String[] args) {
    int[] arr = {45, 67, 89, 9};
    int ind = 0;
    for(int i = 0; i < arr.length; i++){
      int el = arr[i];
      if(el == 67){
        ind = i;
        System.out.println(ind);
      }
      
    }
}
    
}