package Week2.Abstraction;

public abstract class Mineral {
    protected String name;
    protected double iOR;
    protected String [] elements;

    public abstract String getName();
    public abstract void setName(String name);

    public abstract double getIOR();
    public abstract void setIOR(double iOR);
 
    public abstract String[] getElements();
    public abstract void setElements(String [] elements);
    
}
