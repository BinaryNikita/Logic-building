public class _124AlternateArray {
    public static void main(String[] args) {
/*
write a program to print alternate elements in an array.
[11, 12, 13, 15, 16, 18] - 
Output should be- 11, 13, 15,18
*/

int[] arr = {11, 12, 13, 15, 16, 18};
for(int i = 0; i < arr.length; i += 2){
    System.out.println(arr[i]);
    // i++;
}

    }
}
