package Week2.D4E2;

public class Driver {
    public static void main(String[] args){
        BankA a = new BankA();
        BankB b = new BankB();
        BankC c = new BankC();
        a.balance = (long)100;
        b.balance = (long)150;
        c.balance = (long)200;

        System.out.printf("Bank A holds: %d\nBank B holds: %d\nBank C holds: %d\n",a.balance,b.balance,c.balance);
    }
}
