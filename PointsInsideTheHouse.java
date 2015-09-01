/*
Write a program to check whether a point is inside or outside the house below. The point is given as a pair of
floating-point numbers, separated by a space. Your program should print "Inside" or "Outside".
*/

package homework;

import java.util.Locale;
import java.util.Scanner;

public class PointsInsideTheHouse {

    public static void main(String[] args) {
        Locale englishLocale = new Locale("en", "US");
        Locale.setDefault(englishLocale);

        Scanner input = new Scanner(System.in);
        double pointX = input.nextDouble();
        double pointY = input.nextDouble();

        boolean inRoof = isInTriangle(pointX, pointY, 12.5, 8.5, 22.5, 8.5, 17.5, 3.5);
        boolean inFirstBase = isInRectangle(pointX, pointY, 17.5, 12.5, 13.5, 8.5);
        boolean inSecondBase = isInRectangle(pointX, pointY, 22.5, 20, 13.5, 8.5);
        boolean isInside = inRoof || inFirstBase || inSecondBase;
        if (isInside) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }

    private static boolean isInTriangle(double pointX, double pointY, double firstPointX, double firstPointY, double secondPointX, double secondPointY, double thirdPointX, double thirdPointY) {
        /*
        1) Calculate area of the given triangle ABC

        Area A = [ x1(y2 - y3) + x2(y3 - y1) + x3(y1-y2)]/2

        2) Calculate area of the triangle ABP. We can use the same formula for this. Let this area be A1.
        3) Calculate area of the triangle APC.
        4) Calculate area of the triangle PBC.
        5) If P lies inside the triangle, then ABP + APC + PBC must be equal to ABC.
         */
        double areaOfTriangleABC = calculateTriangleArea(firstPointX, firstPointY, secondPointX, secondPointY, thirdPointX, thirdPointY);
        double areaOfTriangleABP = calculateTriangleArea(firstPointX, firstPointY, secondPointX, secondPointY, pointX, pointY);
        double areaOfTriangleAPC = calculateTriangleArea(firstPointX, firstPointY, pointX, pointY, thirdPointX, thirdPointY);
        double areaOfTrianglePBC = calculateTriangleArea(pointX, pointY, secondPointX, secondPointY, thirdPointX, thirdPointY);
        boolean isInside = areaOfTriangleABC == (areaOfTriangleABP + areaOfTriangleAPC + areaOfTrianglePBC);
        return isInside;
    }

    public static boolean isInRectangle(double pointX, double pointY, double upperBoundaryX, double lowerBoundaryX, double upperBoundaryY, double lowerBoundaryY) {
        boolean isInside = ((pointX >= lowerBoundaryX && pointX <= upperBoundaryX) && (pointY >= lowerBoundaryY && pointY <= upperBoundaryY));
        return isInside;
    }

    private static double calculateTriangleArea(double firstPointX, double firstPointY, double secondPointX, double secondPointY, double thirdPointX, double thirdPointY) {
        double area;
        area = Math.abs((firstPointX * (secondPointY - thirdPointY) + secondPointX * (thirdPointY - firstPointY) + thirdPointX * (firstPointY - secondPointY)) / 2);
        return area;
    }
}


