package Session01;

import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap ma sach: ");
        int bookID = Integer.parseInt(sc.nextLine());

        System.out.print("nhap ten sach: ");
        String title = sc.nextLine();

        System.out.print("nhap gia nhap: ");
        float price = sc.nextFloat();

        System.out.print("nhap so luong: ");
        int quantity = sc.nextInt();

        System.out.print("sach con trong kho? (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        double totalValue = price * quantity;
        boolean isLargeStock = quantity > 100;
        boolean canBorrow = isAvailable && quantity > 0;

        System.out.printf("\n=== bao cao sach ===\n");
        System.out.printf("ma sach: %d\n", bookID);
        System.out.printf("ten sach: %s\n", title);
        System.out.printf("gia: %.2f\n", price);
        System.out.printf("so luong: %d\n", quantity);
        System.out.printf("tong gia tri: %.2f\n", totalValue);
        System.out.printf("ton kho lon: %b\n", isLargeStock);
        System.out.printf("trang thai kho: %s\n", canBorrow ? "con hang" : "het hang");
        System.out.printf("co the muon: %b\n", canBorrow);
    }
}
