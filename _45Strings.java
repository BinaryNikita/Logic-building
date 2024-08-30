class Display {   
        // reverse String   
        public void reverseString(String name){
            String rev = " ";
            char newChar;
    
            for(int i = 0; i < name.length(); i++){
                 newChar = name.charAt(i);
                 rev = newChar + rev;
            }
            System.out.println("The reverse of " + name + " is: " + rev);
    
        }
            }
            
            public void PallindroneChecker(String name){
               String rev = "";
               char newChar;
               for(int i = 0; i < name.length(); i++){
                newChar = name.charAt(i);
                rev = rev + newChar;    
            }
            if(rev.equals(name)){
                System.out.println("Pallindrone");
            } else {
                System.out.println("Not pallindrone");
            }
    }
    
    public void lengthChecker(String name){
        int count = 0;
        char newChar;
               for(int i = 0; i < name.length(); i++){
                newChar = name.charAt(i);
                count++;
    }
    System.out.println("The length is" + count);
     }
    
     public void uppLower(String name){
        int upp = 0;
        int low = 0;
        char newChar;
        for(int i = 0; i < name.length(); i++){
            newChar = name.charAt(i);
            if(newChar >= 'A' && newChar <= 'Z'){
                upp++;
            } 
            if(newChar >= 'a' && newChar <= 'z'){
                low++;
            } 
            
          
        }
        System.out.println("The uppercase letters are: " + upp);
        System.out.println("The lowercase letters are: " + low);
        
     }

      class Driver{
        public  void main(String[] args) {
            Display ob = new Display();
            ob.reverseString("Nikita");
            ob.uppLower("Nikita");

        }
     }
     
  
    
    
    
    