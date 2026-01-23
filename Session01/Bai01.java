package Session01;

import java.util.Scanner;

public class Bai01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookID = scanner.nextLine();
        String bookName = scanner.nextLine();
        int publishYear = scanner.nextInt();
        double price = scanner.nextDouble();
        boolean isAvailable = scanner.nextBoolean();

        int tuoiThoSach = 2026 - publishYear;
        String trangThai = isAvailable ? "Còn sách" : "Đã mượn";

        System.out.printf(
                "Ma sach: %s\nTen sach: %s\nNam xuat ban: %d | Tuoi tho sach: %d\nGia: %.2f\nTinh trang: %s",
                bookID,
                bookName.toUpperCase(),
                publishYear,
                tuoiThoSach,
                price,
                trangThai
        );

    }
}
