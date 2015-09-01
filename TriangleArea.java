/*
Write a program that enters 3 points in the plane (as integer x and y coordinates), calculates and prints the area
of the triangle composed by these 3 points. Round the result to a whole number. In case the three points do not form
a triangle, print "0" as result.
*/
package homework;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstPointX = input.nextInt();
        int firstPointY = input.nextInt();
        int secondPointX = input.nextInt();
        int secondPointY = input.nextInt();
        int thirdPointX = input.nextInt();
        int thirdPointY = input.nextInt();
        double area;
        area = Math.abs((firstPointX * (secondPointY - thirdPointY) + secondPointX * (thirdPointY - firstPointY) + thirdPointX * (firstPointY - secondPointY)) / 2);
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.println(format.format(area));
    }
}
