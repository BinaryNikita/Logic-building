 class _143SortInAscending {
    public static void main(String[] args) {

        int[] arr = {4, 6, 1, 3, 9};

        int min = arr[0];
        int sortedArr[] = new int[arr.length];

        for(int i: arr){
            if(min > i){
                min = i;
            }  
            sortedArr[0] = min;
        }

       for(int i = 0; i < arr.length; i++){
        int ch = arr[i];

        for(int j = 0; j < arr.length; j++){

            if(ch <= arr[j] && ch > min){
                min = ch;
                System.out.println(min);
            }
        }
    }
            

        }
       }

     class _1{

        public static void main(String[] args) {
            
        
        String[] todo = {"Eat", "Sleep", "Walk"};
        String mark = "EAt";
        for(String words : todo){
            if(mark.equalsIgnoreCase(words)){
                words = "Updated" + words;
                System.out.println();
            }
        }
        String del = "Eat";
                String[] deleteTodo = new String[todo.length-1];
                for(int d = 0; d < todo.length; d++){
                    if(del.equalsIgnoreCase(todo[d])){
                        continue;
                    }
                    deleteTodo[d] = todo[d];

                    System.out.println(deleteTodo[d]);
                }


     } }