package Week2.Evaluation;

/**
 * 6. Minutes To Years and Days Calculator
 * 
 * Write a method printYearsAndDays with parameter of type long named minutes.
 * The method should not return anything (void) and it needs to calculate the
 * years and days from the minutes parameter.
 * 
 * If the parameter is less than 0, print text "Invalid Value".
 * 
 * Otherwise, if the parameter is valid then it needs to print a message in the
 * format "XX min = YY y and ZZ d".
 * 
 * XX represents the original value minutes. YY represents the calculated years.
 * ZZ represents the calculated days.
 */

public class MinutesAndYears {

    public static void main(String [] args){
        printYearsAndDays(36644345);
    }

    //WARNING: THIS METHOD STARTED WITH A STRING TYPE
    public static void printYearsAndDays(long minutes) {
        //base variables
        int years = 0;
        int days = 0;
        int remainingDays = 0;

        if(minutes < 0){
            System.out.println("Invalid Value");
        } else {
            //if there's at least one day...
            if(minutes >= 60*24){
                 //Get the total number of days
                days = Math.round(minutes / 60 / 24);
                System.out.println(days);
                
                //subtract days until it's evenly divisible by 365 to get years
                if(days > 365){
                    while(days % 365 != 0){
                        days --;
                        remainingDays++;
                    }
                    years = days/365;
                    System.out.println(years);
                }


                //if not exit
                System.out.printf("%d min = %d y and %d d\n",minutes,years,remainingDays);

            } else {
                System.out.printf("%d min = %d y and %d d\n",minutes,years,remainingDays);
            }
           
        }

        //RETURN NULL WAS HERE
	}
}
