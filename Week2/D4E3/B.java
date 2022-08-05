package Week2.D4E3;

public class B extends Marks{
    double biology;
    double calculus;
    double discreteMath;
    double cs;

    B(double biology, double calculus, double discreteMath, double cs) {
        this.biology = biology;
        this.calculus = calculus;
        this.discreteMath = discreteMath;
        this.cs = cs;
    }

    @Override
    public void getPercentage(){
        System.out.printf("\nStudent Grades:\nBio210 - %f | Calc1 - %f | Math20 - %f | CS210 - %f\n", this.biology, this.calculus, this.discreteMath, this.cs);
    }  
    
}
