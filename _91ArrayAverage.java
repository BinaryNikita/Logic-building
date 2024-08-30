public class _91ArrayAverage {
  
    public static void main(String[] args) {
        int[] a = {1,3,5,7};
        int sum = 0;
        for(int i = 0; i < a.length; i++){
          sum +=  a[i];
          }
        int avg = sum/a.length;
        System.out.println("The average is " + avg);

    }
}
