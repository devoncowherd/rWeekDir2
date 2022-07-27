package Week1;

class algoCheck {
    public static void main(String [] args) {

        int result = checkDivisible(-5,7);
        System.out.println(result);
    }


    public static int checkDivisible(int x,int y) {
        
        int testX = x;

        if(x % y == 0){
            return x;
        }

        while(testX % y != 0){
            testX += 1;
        }
        return testX;
    }
}