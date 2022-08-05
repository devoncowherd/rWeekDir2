package Week2.Exceptions;

public class FreshFood {
    boolean isFresh;
    String food;

    FreshFood(boolean isFresh, String food){
        this.isFresh = isFresh;
        this.food = food;
    }

    public void checkFood(){
        try{
            if(this.isFresh){
                System.out.println("It's time to eat your delicious " + this.food);
    
            }else{
                throw new SpoiledFoodException();
            }
        } catch(SpoiledFoodException e){
            System.out.println("Tossed...All better! Let's find some other food!");
        }

    }
}
