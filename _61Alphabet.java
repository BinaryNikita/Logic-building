class E {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1 ; i<= rows; i++){
            for(int  j = 1; j <= rows; j++){
                if(i == 1 || i == 5 || i == 3 && j > 2 || j == 1){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
class G {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1 ; i<= rows; i++){
            for(int  j = 1; j <= rows; j++){
                if(i == 1 || i == 5 || j == 1 || (j == 5 && i > 2) || (i == 3 && j > 2 )){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class Alphabet{
    public static void main(String[] args) {
        int rows = 5;
        char ch = 'A';
        for(int i = 1 ; i<= rows; i++){
            for(int  j = 1; j <= rows-1; j++){
                System.out.print(ch + " ");
                ch++;

                }
                System.out.println();
}
    }
}
class M{
public static void main(String[] args) {
    int rows = 5;
    for(int i = 1; i <= rows; i++){
        for(int j = 1; j <= rows; j++){
            if(j == 1 || j == 5 || i + j == 6 && i < 4 || i == j && i < 4){
                System.out.print("* ");
            } else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
}

class S{
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows; j++){
                if(i == 1 || i == rows || j == 1 && i != 4 || j == 5 && i != 2 || i == 3 ){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class D{
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows+1; j++){
                if(j == 2 || i == 1 || i == 5 || j == 6){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        } 
    }
}

class W {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows; j++){
                if(j == 1 || j == 5 || i == j && i > 2 || i + j == 6 && i > 2  ){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        } 
    }
}

class Jalphabet{
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int j =1; j <= rows; j++){
                if(j == 3 || i == 1 || i == 5 && j < 3 || i == 4 && j == 1 || i == 4 && j == 1){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
    }
    System.out.println();
}
} 
}
class Talphabet{
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 1; i <= rows; i++){
            for(int j =1; j <= rows; j++){
                if(j == 3 || i == 1 || i == 2 && j == 1 || i == 2 && j == 5){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
    }
    System.out.println();
}
} 
}

class X {
    public static void main(String[] args) {
        int rows = 5;

    for (int i = rows; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            if (i == j || i + j == 6 || i == 1 || i == 5 || i == 2 && j == 3 || i == 4 && j == 3) {
                System.out.print(j + " ");

            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
        }
    }

    class K {
        public static void main(String[] args) {
            for (int i = 1; i <= 7; i++) {
                for (int j = 1; j <= 4; j++) {
                    if (j == 1 || (i + j == 5 && j != 1) || (i - j == 3 && j != 1) || i == 1 || i == 7 || i == 2 && j == 2 || i == 6 && j == 2) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }