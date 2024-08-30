public class _97ArrayDelete {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int ind = a.length - 1;
        int[] b = new int[ind]; 
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 3) {
                continue;
            }
            b[j] = a[i];
            j++;
        }
        for(int k = 0; k < b.length; k++){
            System.out.println(b[k]);
        }
    }
}
