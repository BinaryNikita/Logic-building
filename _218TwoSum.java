import java.util.Scanner;
public class _218TwoSum {

    public int[] twoSum(int[] nums, int target) {

       
     for(int i = 0; i < nums.length; i++){

     for(int j = 0; j < nums.length; j++){
        if(nums[i] + nums[j] == target && i != j){
            System.out.println("[ " + i + " " + j + " ]");
        }
     }
    }
    return nums;
}
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        for(int i = 0; i < nums.length; i++){
            System.out.print("Enter array elements: ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum: ");
        int target = sc.nextInt();
        _218TwoSum ob = new _218TwoSum();
        System.out.println(ob.twoSum(nums, target));

        
    }

}
