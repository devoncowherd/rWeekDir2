package Lambdas;

import java.util.*;

public class LambdaParty {

    public static void main(String [] args){
        List<String> list = new ArrayList();
        list.add("Devon");
        list.add("Varun");
        list.add("Kurt");
        list.add("Charlie");

        list.forEach( name -> {
            System.out.println(name + "...is a name I'm printing");
        });

        String b = "taffy";
        FunkyInterface tester = a -> {
            return a + a;
        };

        System.out.println(tester.print(b));

        

    }
    


    public static String addCandy(String a){
        //useless test function :D Uncle Bob Triggered
        return a + " candy";
    }
}

interface FunkyInterface {
    public String print(String test);
}

