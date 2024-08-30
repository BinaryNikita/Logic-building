
    class Diamond2{
        public static void main(String[] args) {
            int rows = 5;
            for(int i = 1; i <= rows; i++){
                for(int j =1; j <= rows; j++){
                    if(i+j == 4 || i -j == 2 || i + j == 8 || j -i == 2 || i == 3 || j == 3){
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
        }
        System.out.println();
    }
        }
    }

    class Diamond6{
        public static void main(String[] args) {
            int rows = 7;
            for(int i = 1; i <= rows; i++){
                for(int j =1; j <= rows; j++){
                    if(i+j == 5 || i -j == 3 || i + j == 11 || j -i == 3 || i == 1 || j == 1|| j == rows|| i == rows || i + j == 4 || j - i == 4 || i - j == 4 || i + j == 12){
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
        }
        System.out.println();
    }
        }
    }
    class Diamond3{
        public static void main(String[] args) {
            int rows = 5;
            for(int i = 1; i <= rows; i++){
                for(int j =1; j <= rows; j++){
                    if(i+j == 4 || i -j == 2 || i + j == 8 || j -i == 2 || i == 3 || j == 3){
                        System.out.print(i + " ");
                    } else{
                        System.out.print("  ");
                    }
        }
        System.out.println();
    }
        }
    }
    class Diamond4{
        public static void main(String[] args) {
            int rows = 5;
            for(int i = 1; i <= rows; i++){
                for(int j =1; j <= rows; j++){
                    if(i+j == 4 || i -j == 2 || i + j == 8 || j -i == 2 || i == 3 || j == 3){
                        System.out.print(j + " ");
                    } else{
                        System.out.print("  ");
                    }
        }
        System.out.println();
    }
        }
    }
    
    class Diamond5{
        public static void main(String[] args) {
            int rows = 5;
            for(int i = 1; i <= rows; i++){
                for(int j =1; j <= rows; j++){
                    if(i+j == 4 || i -j == 2 || i + j == 8 || j -i == 2){
                        System.out.print("* ");
                    } else{
                        System.out.print("  ");
                    }
        }
        System.out.println();
    }
        }
    }

    
    
class HollowDiamond{
    public static void main(String[] args) {


                int rows = 5;
                for(int i = 1; i <= rows; i++){
                    for(int j =1; j <= rows; j++){
                        if(i == 5 || j == 5 || i == 1 || j == 1 || i - j == 2 || j - i == 2 || i + j == 8 || i + j == 4){
                            System.out.print("* ");
                        } else{
                            System.out.print("  ");
                        }
            }
            System.out.println();
        }
            }
        }


    