class Triangle {
public static void main(String[] args) {
    int rows = 5;
    for(int i = 1; i <= rows; i++){
        for(int j = 1; j <= i; j++){
            
            // System.out.print(i);
            System.out.print("* ");
        }
        System.out.println(" ");
    }
    System.out.println();
}
    
}
class Triangle2 {
public static void main(String[] args) {
    int rows = 5;
    for(int i = 1; i <= rows; i++){
        for(int j = 1; j <= i; j++){
            
            // System.out.print(i);
            System.out.print(i);
        }
        System.out.println(" ");
    }
    System.out.println();
}
    
}
class Triangle3 {
public static void main(String[] args) {
    int rows = 5;
    for(int i = 1; i <= rows; i++){
        for(int j = 1; j <= i ; j++){
            
            System.out.print(j);
        }
        System.out.println(" ");
    }
    System.out.println();
}
    
}
class Triangle4 {
public static void main(String[] args) {
    char rows = 'D';
    for(char i = 'A'; i <= rows; i++){
        for(char j = 'A'; j <= i ; j++){
            
            System.out.print(j+ " ");
        }
        System.out.println(" ");
    }
    System.out.println();
}
    
}
class Triangle5 {
public static void main(String[] args) {
    char rows = 'E';
    for(char i = 'A'; i <= rows; i++){
        for(char j = 'A'; j <= i ; j++){
            
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    System.out.println();
}
    
}

class Triangle6 {
    public static void main(String[] args) {
             //0 
            //01 
           //0112 
          //01123 

        int rows = 4; 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
              System.out.print(j);
            }

            System.out.println();
        }
    }
}
class Triangle7 {
    public static void main(String[] args) {
        // 1
        // 23
        // 456
        // 7891
        int rows = 5;
        int count = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}

class Triangle8{
    public static void main(String[] args) {
        int rows = 10;
int j;
for (int i = 2; i <= rows; i++) {
    for (j = 2; j <= i; j++) {
        if(j % 2 == 0)
            System.out.print(j + " ");
    }
    System.out.println();
}
    }   
}

class ReverseLeftTriangle{
    public static void main(String[] args) {
        int rows = 5;
        for(int i = rows; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                
                // System.out.print(i);
                System.out.print("* ");
            }
            System.out.println();
        }

        
    }



}