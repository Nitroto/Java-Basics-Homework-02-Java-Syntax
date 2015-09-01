/*
Write a program to check whether a point is inside or outside of the figure below. The point is given as a pair of
floating-point numbers, separated by a space. Your program should print "Inside" or "Outside".
*/
package homework;

        import java.util.Locale;
        import java.util.Scanner;

public class PointsInsideAFigure {

    public static void main(String[] args) {
        Locale englishLocale = new Locale("en", "US");
        Locale.setDefault(englishLocale);

        Scanner input = new Scanner(System.in);
        double pointX = input.nextDouble();
        double pointY = input.nextDouble();
        boolean inFirstFigure = isInRectangle(pointX, pointY, 22.5, 12.5, 8.5, 6);
        boolean inSecondFigure = isInRectangle(pointX, pointY, 17.5, 12.5, 13.5, 8.5);
        boolean inThirdFigure = isInRectangle(pointX, pointY, 22.5, 20, 13.5,8.5);
        boolean isInside = inFirstFigure || inSecondFigure || inThirdFigure;
        if (isInside) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }

    public static boolean isInRectangle(double pointX, double pointY, double upperBoundaryX, double lowerBoundaryX, double upperBoundaryY, double lowerBoundaryY) {
        boolean isInside = ((pointX >= lowerBoundaryX && pointX <= upperBoundaryX) && (pointY >= lowerBoundaryY && pointY <= upperBoundaryY));
        return isInside;
    }
}
