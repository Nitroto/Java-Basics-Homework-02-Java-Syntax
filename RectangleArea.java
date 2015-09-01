/*
Write a program that enters the sides of a rectangle (two integers a and b)
and calculates and prints the rectangle's area.
*/

package homework;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int area = a * b;
        System.out.println(area);
    }
}