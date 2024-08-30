public class _104SecondLargest {
            public static void main(String[] args) {
            int[] nums = {1, 3, 5, 6, 7, 7,8};
            int largest = nums[0];
            int second = nums[0];
            for(int i = 0; i < nums.length; i++){
            if(largest < nums[i]){
            largest = nums[i];
            }
            }
            int i = 0;
            while(i < nums.length){
                if(second < nums[i] &&  nums[i] != largest){
                    second = nums[i];
                } 
                i++;
            }
            
          

            
              System.out.println(second);
                        
    }
}

 