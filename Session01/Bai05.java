package Session01;

import java.util.Scanner;

public class Bai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach (4 chu so): ");
        int number = sc.nextInt();

        int thousands = number / 1000;
        int hundreds = (number / 100) % 10;
        int dozens = (number / 10) % 10;
        int units = number % 10;

        int sumOfFirstThreeNumber = thousands + hundreds + dozens;
        int expectedCheckDigit = sumOfFirstThreeNumber % 10;

        boolean isValid = expectedCheckDigit == units;

        System.out.println("Chu so kiem tra ky vong: " + expectedCheckDigit);
        System.out.println("Ket qua kiem tra ma sach: " + (isValid ? "HOP LE" : "SAI MA"));

    }
}
