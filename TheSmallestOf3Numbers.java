/* Write a program that finds the smallest of three numbers. */

package homework;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class TheSmallestOf3Numbers {

    public static void main(String[] args) {
        Locale englishLocale = new Locale("en", "US");
        Locale.setDefault(englishLocale);

        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double max = (a < b && a < c) ? a : ((b < a && b < c) ? b : c);
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.println(format.format(max));
    }
}
