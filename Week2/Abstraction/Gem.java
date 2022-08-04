package Week2.Abstraction;

import java.util.Arrays;

//must now implement parent methods
public class Gem extends Mineral {
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getIOR(){
        return this.iOR;
    }
    public void setIOR(double iOR){
        this.iOR = iOR;
    }
 
    public String[] getElements(){
        return this.elements;
    }
    public void setElements(String [] elements){
        this.elements = elements;
    }

    public void getDescription(){
        squiggle();

        System.out.printf(
            "Gem: %s\nElements: %s\nIndex of Refraction: %f",
            this.getName(), 
            Arrays.toString(this.getElements()),
            this.getIOR());

        squiggle();
    }
    
    public static void squiggle(){
        System.out.println();
        for(int i = 0; i < 11; i++){
            System.out.print("~");
        }
        System.out.println();
    }
}
