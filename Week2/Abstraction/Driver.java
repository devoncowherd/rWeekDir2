package Week2.Abstraction;

import java.util.Arrays;

public class Driver {
    public static void main(String [] args){
        Gem diamond = new Gem();

        String [] diamondElements = {"Carbon"};

        diamond.setElements(diamondElements);
        diamond.setName("Diamond");
        diamond.setIOR(2.418);


        Gem ruby = new Gem();
        String [] rubyElements = {"Chromium", "Aluminum", "Oxygen"};
        ruby.setName("Ruby");
        ruby.setElements(rubyElements);
        ruby.setIOR(1.762);

        diamond.getDescription();
        ruby.getDescription();
    }
    
}
