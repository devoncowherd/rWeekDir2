package Week1;

public class PrimeCheck {
    public static void main(String [] args) {

        System.out.println(checkPrime(2000));
        
    }

    static int checkPrime(int a) {

        boolean isPrime = true;

        if(a == 2 || a == 3){
            return a;
        }
    
        for(int i = 2; i < a; i++) {
            if(a % i == 0) {
                isPrime = false;
            }
        }

        if(isPrime) {
            return a;
        }
        
        if(isPrime == false) {
            for(int k = a + 1; k < 10000; k++){
                for(int j = 2; j <= k; j++){
                    if(j == k){
                        return k;
                    }
                    if(k % j == 0){
                        break;
                    }
                }
            }

        }
        return 0;
    }

}
