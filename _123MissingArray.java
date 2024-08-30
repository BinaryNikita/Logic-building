
public class _123MissingArray {
public static void main(String[] args) {
    int[] arr = {11, 12, 13, 15, 16,17};
    int first = arr[0];
    int last = arr[arr.length-1];
    for(int i = first; i <= last; i++) {
        int count = 0;
    for(int j = 0; j < arr.length; j++){
        if(i == arr[j]){
            count++;
        }   
    }
    if(count == 0){
        System.out.println(i);
    }
    }

    }
    }


    
