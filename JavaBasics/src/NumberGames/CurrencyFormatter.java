package NumberGames;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter Currency amount");
        double payment=scan.nextDouble();
        scan.close();

        String payUS=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String payChina=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String payFrance=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String payIndia=NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);

        System.out.println("US:: "+payUS);
        System.out.println("CHINA:: "+payChina);
        System.out.println("FRANCE:: "+payFrance);
        System.out.println("INDIA:: "+payIndia);

    }
}
