public class _99Pattern {
    public static void main(String[] args) {
      int n = 5; 
      int num;
  
      for (int i = 1; i <= n; i++) {
        for (int j = n; j >= i; j--) {
          System.out.print("  ");
        }
        num = i;
        for (int k = 1; k <= i * 2 - 1; k++) {
          System.out.print(num + " ");
          if (k < i) {
            num--;
          } else {
            num++;
          }
        }
        System.out.println();
      }
    }
  }
  