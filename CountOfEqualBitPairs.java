/*
Write a program to count how many sequences of two equal bits ("00" or "11") can be found in the binary representation
of given integer number n (with overlapping).
 */
package homework;

import java.util.Scanner;

public class CountOfEqualBitPairs {

    public static final int BITS = 31;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int pairsCounter = 0;
        int previousBit = 0;
        boolean isInNumber = false;
        for (int i = BITS; i >= 0; i--) {
            int currentBit = ((number >> i) & 1);
            if (currentBit == 1 || isInNumber) {
                isInNumber = true;
                if (previousBit == currentBit) {
                    pairsCounter++;
                }
            }
            previousBit = currentBit;
        }
        System.out.println(pairsCounter);
    }
}
