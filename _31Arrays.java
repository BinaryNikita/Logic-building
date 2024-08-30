class numReverse {
    public static void main(String[] args) {
        int[] num = {1,3,4,7};
        int[] revNum = new int[4];
        int count = 3;
        for(int i = 0; i < num.length; i++){
            revNum[count] = num[i];
            count--;
        }
        num = revNum;
        for(int i = 0; i < num.length; i++){

            System.out.print(num[i] + " ");
        }
        
    }
}

class stringReverse {
    public static void main(String[] args) {
        String[] names = {"Nikita", "Neha", "Priyanshi", "Payal"};
        String[] revNames = new String[4];

        int count = 3;
        for(int i = 0; i < names.length; i++){
            revNames[count] = names[i];
            count--;
        }
        names = revNames;
        System.out.println(names[0]); 
        System.out.println(names[1]); 
        System.out.println(names[2]); 
        System.out.println(names[3]); 
    }
 

}

class changeElements{
    public static void main(String[] args) {
        String[] name = {"Nikita", "Neha", "Priyanshi", "Payal"};
         name[0] = "Lakshmi";
         System.out.println(name[0]);
    }
}

class arraySum{
    public static void main(String[] args){
        int[] nums = {12,15,6,21,8};
        int sum = 0;
        for(int i = 0; i < nums.length; i++ ){
            sum = sum  + nums[i];
        }
        System.out.println(sum);
    }
}
class MaxArray{
    public static void main(String[] args) {
        int[] nums = {12,15,6,21,8};
        int max = nums[0];
        for(int i = 0; i < nums.length; i++ ){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        System.out.println(max);
                
        }

        

    }
class MinArray{
    public static void main(String[] args) {
        int[] nums = {12,15,6,21,8};
        int min = nums[0];
        for(int i = 0; i < nums.length; i++ ){
            if(min > nums[i]){
                min = nums[i];
            }
        }
        System.out.println(min);
                
        }

        

    }


    class arrayReverse{
        public static void main(String[] args) {
            int[] arr = { 2, -1, 4, 6, 7, 8, 2 };
            int i = 0;
            int j = arr.length - 1;
            while(i < j){
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }

            for(int d = 0; d < arr.length; d++){
                System.out.println(arr[d]);
            }

        }
    }