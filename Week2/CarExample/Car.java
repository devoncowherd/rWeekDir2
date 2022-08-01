package Week2.CarExample;

public class Car {

    private int wheelNumber = 4;
    private String brand = "";

    public void start(){
        System.out.println("Putter putter...");
    }
    
    public void setWheelNumber(int wheelNumber) {
        if(wheelNumber < 4) {
            return;
        }
        this.wheelNumber = wheelNumber;
    }

    public int getWheelNumber(){
        return wheelNumber;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
