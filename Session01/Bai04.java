package Session01;

import java.util.Scanner;

public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá sách (usd - kiểu double):");
        double priceUsd = sc.nextDouble();

        System.out.print("Nhập tỷ giá (kiểu float): ");
        float rate = sc.nextFloat();

        double totalVnd = priceUsd * rate;
        long roundedVnd = (long) totalVnd;

        System.out.println("giá chính xác (số thực): " + totalVnd);
        System.out.println("giá làm tròn để thanh toán (long): " + roundedVnd);
    }
}
