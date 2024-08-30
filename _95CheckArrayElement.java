public class _95CheckArrayElement {
    public static void main(String[] args) {
        int [] a  = {1,3, 6, 7, 9};
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 3){
                count++;
            }
        }

        if(count == 1){
            System.out.println("It contains 3");
        } else {
            System.out.println("It does not contain 3");
        }
    }
}
