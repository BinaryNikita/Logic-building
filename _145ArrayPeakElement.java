public class _145ArrayPeakElement {
    /*
Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are
less than 20.
Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, 
similarly 90 has neighbors 23 and 67. 
*/
public static void main(String[] args) {
    
    int[] arr = {5, 10, 20, 15};
    
    for(int i = 1; i < arr.length; i++) {
        int count = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[i] > arr[j]){
              count++;
            }
        }
        if(count > 1){
            System.out.println(arr[i]);
        }
        
    }
}


}
