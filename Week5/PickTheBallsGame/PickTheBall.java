package Week5.PickTheBallsGame;

//Given:
//Q, N, & P are positive integers
//1 <= N, P, & Q <= 10^9
//1 <= result <= 10^9
//Story:
//Jack and John are playing a game called PickTHeBalls
//Jack picks first
//Jack can pick P balls
//John can pick Q balls
//Find the total balls held by the last person who picked
//Example Input:
//N = 30, p = 4, Q= 5; Result = 15;

public class PickTheBall {
    public static void main(String [] args) {
        System.out.println("Script loaded...!");
        System.out.println(
            lastPickSum(4,5,30)
            );
    }

    public static int lastPickSum(int p, int q, int n) {
        int result = -404;
        int jackTotal;
        int johnTotal;
        int turns = 0;
        boolean jackTurn = true;
        boolean johnTurn = false;
        System.out.println(turns);


        for(jackTotal = 0, johnTotal = 0; jackTotal + johnTotal <= n; ){
            ++turns;
            if(jackTurn) {
                jackTurn = false;
                johnTurn = true;
                jackTotal += p;
                System.out.printf("Jack | Total:%d | Turn:%b\n", jackTotal, jackTurn);
                continue;
            }

            if(johnTurn) {
                jackTurn = true;
                johnTurn = false;
                johnTotal += q;
                System.out.printf("John | Total:%d | Turn:%b\n", johnTotal, johnTurn);
                continue;
            }
        }

        if(jackTurn == true){
            return jackTotal;
        }

        if(johnTurn == true){
            return johnTotal;
        }

        return result;
    }
}
