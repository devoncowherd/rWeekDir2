package Week2.D4E3;

public class A extends Marks{

    double biology;
    double calculus;
    double discreteMath;

    A(double biology, double calculus, double discreteMath) {
        this.biology = biology;
        this.calculus = calculus;
        this.discreteMath = discreteMath;
    }

    @Override
    public void getPercentage(){
        System.out.printf("\nStudent Grades:\nBio210 - %f | Calc1 - %f | Math20 - %f\n", this.biology, this.calculus, this.discreteMath);
    }    
}
