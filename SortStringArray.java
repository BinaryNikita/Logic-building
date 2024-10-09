public class SortStringArray {
    public static void main(String[] args) {
String[] arr = {"Nikita", "Payal", "Kashish", "Aakansha"};
for(int i = 0; i < arr.length; i++){
    for(int j = i+1; j < arr.length; j++){
        if(arr[i].charAt(0) > arr[j].charAt(0)){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

for(String a: arr){
    System.out.println(a);
}
    }
}

class StringOperations{
    public static void main(String[] args) {
        String str = "This is a test string";
        String newStr = "";
        int wordCount = 0;
        int spaceCount = 0;

        for(int i = 0; i < str.length(); i++){
           if(str.charAt(i) != ' '){
              newStr += str.charAt(i);
           } else {
              wordCount++;
              spaceCount++;
           }
        }

        System.out.println(wordCount+1);
        System.out.println(spaceCount);
        System.out.println(newStr);

    }
}
