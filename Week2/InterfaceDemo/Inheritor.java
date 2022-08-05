package Week2.InterfaceDemo;

public class Inheritor implements A,B,C{

    Inheritor(){
        powerOn();
    }

    public void swipe(){
        System.out.println("...Swiped");
        startVirtualAssistant();
    }
    
    public void display(){
        System.out.println("...Render screen");
    }

    public void powerOn(){
        System.out.println("...Powering on!");
        display();
        scanFinger();
        scanFace();
        swipe();

    }

    public void powerOff(){
        System.out.println("...Powering Off!");
    }

    public void startVirtualAssistant(){
        System.out.println("...Starting virtual assistant");
        powerOff();
    }

    public void scanFinger(){
        System.out.println("...Fingerprint scanned");
    }

    public void scanFace(){
        System.out.println("...Face scanned!");
    }


    
}
