import java.util.Arrays;

public class _216MERGESORTEDSARRAY {
    public static void main(String[] args) {
         int[] nums1 = {1, 2, 3, 0, 0, 0};
         int[] nums2 = {2, 5, 6};
         int m = 0;
         int n = 0;
         for(int i = 0; i < nums1.length; i++){
            if(nums1[i] != 0){
                m++;
            }
            if(i < nums2.length && nums2[i] != 0 ){
                n++;
            }
         }

         int[] merge = new int[m+n];
         int indexOfn = 0;
         for(int i = 0; i < merge.length; i++){
                if(nums1[i] != 0){
                    merge[i] = nums1[i];
                } 

                if(i >= m && nums2[indexOfn] != 0){
                    merge[i] = nums2[indexOfn]; 
                    indexOfn++;
                }
             }


         for(int i = 0; i < merge.length; i++){
            for(int j = i + 1; j < merge.length; j++){
                if(merge[i] > merge[j]){
                    int temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }
            }
         }

         System.out.println(Arrays.toString(merge));
    }
}






class _2approach{

    public void merge(int nums1[], int m, int nums2[], int n){
      
        int[] merge = new int[m+n];
        int i , j , k;
        i = 0; 
        j = 0;
        k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merge[k++] = nums1[i++];
            } else {
                merge[k++] = nums2[j++];
            }
        }

        while(i < m){
            merge[k++] = nums1[i++]; 
        }
        while(j < n){
            merge[k++] = nums1[j++]; 
        }

        System.out.println(Arrays.toString(merge));

    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0}; 
        int[] nums2 = {2, 5, 6}; 
        int m = 3; 
        int n = 3; 
        _2approach ob = new _2approach();
        ob.merge(nums1, m, nums2, n);
    }
}