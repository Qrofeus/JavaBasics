package NumberGames;

import java.util.Scanner;

public class ExpoChange {
    //y=a(1+r)^x
    //Y -> final result
    //A -> Initial value
    //R -> Growth rate
    //X -> Time interval
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //Initial value
        System.out.println("Initial value:: ");
        double init=scan.nextDouble();
        //Growth rate
        System.out.println("Change Rate:: ");
        double change=scan.nextDouble();
        //Time interval--Years
        System.out.println("Time interval (years):: ");
        double years=scan.nextDouble();

        //Calculate result
        System.out.printf("\nExpected growth at the end of %.2f years--\n%.3f",years,getExpoResult(init,change,years));
    }

    public static double getExpoResult(double initial, double changeRate, double timePeriod){
        return initial*Math.pow((changeRate),timePeriod);
    }
}
