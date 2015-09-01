/*
Write a program to calculate the count of bits 1 in the binary representation of given integer number n.
*/
package homework;

import java.util.Scanner;

public class CountOfBitsOne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int bitCounter = 0;
        for (int i = 31; i >= 0; i--) {
            if (((number >> i) & 1) == 1) {
                bitCounter++;
            }
        }
        System.out.println(bitCounter);

    }
}
