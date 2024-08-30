public class _157ArrayElementAtSecond {
    public static void main(String[] args) {
      int[] arr = {1, 2, 1, 4, 5};
      int[] arr2 = new int[arr.length+1];
      int ind = 0;
      for(int i = 0; i < arr.length; i++) {
          if(i == 2) {
              arr2[ind] = 9;
              ind++;
            } 
            arr2[ind] = arr[i];
          ind++;
      } 
      arr = arr2;
      for(int i = 0; i < arr.length; i++){
         System.out.println(arr[i]);
      }  
    }
}

