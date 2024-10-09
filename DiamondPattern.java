class _143SortInAscending {
    public static void main(String[] args) {

        int[] arr = { 4, 6, 1, 3, 9 };

        int min = arr[0];
        int sortedArr[] = new int[arr.length];

        for (int i : arr) {
            if (min > i) {
                min = i;
            }
            sortedArr[0] = min;
        }

        for (int i = 0; i < arr.length; i++) {
            int ch = arr[i];

            for (int j = 0; j < arr.length; j++) {

                if (ch <= arr[j] && ch > min) {
                    min = ch;
                    System.out.println(min);
                }
            }
        }

    }
}

class _1 {

    public static void main(String[] args) {

        String[] todo = { "Eat", "Sleep", "Walk" };
        String mark = "EAt";
        for (String words : todo) {
            if (mark.equalsIgnoreCase(words)) {
                words = "Updated" + words;
                System.out.println();
            }
        }
        String del = "Eat";
        String[] deleteTodo = new String[todo.length - 1];
        for (int d = 0; d < todo.length; d++) {
            if (del.equalsIgnoreCase(todo[d])) {
                continue;
            }
            deleteTodo[d] = todo[d];

            System.out.println(deleteTodo[d]);
        }

    }
}

/**
 * Test
 */
public class DiamondPattern {
    public static void main(String[] args) {
        int rows = 9;
        int cols = 9;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if ((i + j >= 4 && i + j <= 12) && (j - i <= 4 && i - j <= 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



class DiamondAnother{
    public static void main(String[] args) {
        int rows = 9;
        for(int i = 1; i <= rows; i++){
            for(int j =1; j <= rows; j++){
                if(i+j == 6 || i -j == 4 || i + j == 14 || j -i == 4 || i == 5 || j == 5){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
    }
    System.out.println();
}
    }
}
