public class _142CheckElement {
    //Check if the element 25 is present in the array [5, 10, 15, 20].

    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5};
        boolean check = false;
        for(int i: arr){
            if(i == 1){
                check = true;
            } 
        }
        if(check == true){
            System.out.println("It contains element");
        } else{
            System.out.println("It does not contain.");
        }
        
    }
}
