/*
Write a program that enters a positive integer number num and converts and prints it in hexadecimal form.
You may use some built-in method from the standard Java libraries.
*/
package homework;

import java.util.Scanner;

public class DecimalToHexadecimal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String hex;
        hex = Integer.toHexString(number);
        System.out.println(hex.toUpperCase());
    }
}
