package Session01;

import java.util.Scanner;

public class Bai02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số ngày chậm trễ: ");
        int n = scanner.nextInt();
        System.out.print("Nhập số lượng sách mượn: ");
        int m = scanner.nextInt();
        double tienPhatGoc = n * m * 5000;
        double tienPhatSauDieuChinh = tienPhatGoc;

        if (n > 7 && m >= 3) {
            tienPhatSauDieuChinh = tienPhatGoc * 1.2;
        }
        boolean khoaThe = tienPhatSauDieuChinh > 50000;
        System.out.println();
        System.out.println("Tiền phạt gốc: " + tienPhatGoc + " VNĐ");
        System.out.println("Tiền phạt sau điều chỉnh: " + tienPhatSauDieuChinh + " VNĐ");
        System.out.println("Yêu cầu khóa thẻ: " + khoaThe);
    }
}
