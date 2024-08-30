public class _133RemoveOdd {

            public static void main(String[] args) {
            //Remove all even numbers from the array [1, 2, 3, 4, 5, 6].
                int[] arr = {1, 2, 3, 4, 5, 6};
                int len = 0;
                System.out.println("Original array");
                for(int i = 0; i < arr.length; i++){
                    System.out.println(arr[i] + " ");
                    if(arr[i]%2 == 0){
                        len++;
                    }
                }

                int ind = 0;
                int[] evenArr = new int[len];
                for(int i = 0; i < arr.length; i++){
                    if(arr[i]%2 == 0){
                        evenArr[ind] = arr[i];
                        ind++;
                    }
                }
                arr = evenArr;
                System.out.println("New array with even numbers only.");
             for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i] + " ");
             }      
            }
        }
        

