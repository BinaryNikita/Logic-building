class FiveMultiples{
    public static void main(String[] args) {
        int num = 5;
        for(int i = 5; i <= 50; i++){
            if(i%num == 0){
                System.out.println(i);
            }
        }
    }
}