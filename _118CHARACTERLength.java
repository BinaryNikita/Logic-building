 public class _118CHARACTERLength {
    public static void main(String[] args) {
//WAP to find out total occurrence of each letter in string.
	//  Sample Input: “aabbccddd”
	//  Output:   a- 2 times
	// 		b- 2 times
	// 		c- 2 times
	// 		d- 3 times

    String str1 = "aabbccddd";
    int aCount = 0;
    int bCount = 0;
    int cCount = 0;
    int dCount = 0;
    for(int i = 0; i < str1.length(); i++){
        if(str1.charAt(i) == 'a'){
            aCount++;
        }
        if(str1.charAt(i) == 'b'){
            bCount++;
        }
        if(str1.charAt(i) == 'c'){
            cCount++;
        }
        if(str1.charAt(i) == 'd'){
            dCount++;
        }
    }
    System.out.println("Number of a is "+ aCount);
    System.out.println("Number of b is "+ bCount);
    System.out.println("Number of c is "+ cCount);
    System.out.println("Number of d is "+ dCount);
    }
}
