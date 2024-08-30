class CountDigits {
    public static void main(String[] args) {
        int num = 53667238;
        int count = 0;
        int rem;
        while(num != 0){
            rem = num % 10;
            count++;
            num/= 10;
        }
System.out.println(count);
    }
}
