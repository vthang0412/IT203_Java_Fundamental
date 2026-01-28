package Session04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Btth_ss04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id;
        String isbn;
        String nxb;
        String ten;
        String tacGia;

        Pattern idPattern = Pattern.compile("LIB-\\d{4}-S");
        Pattern isbnPattern = Pattern.compile("\\d{10}");
        Pattern yearPattern = Pattern.compile("\\d{4}");

        do {
            System.out.print("Nhap ma sach: ");
            id = sc.nextLine();
            Matcher m = idPattern.matcher(id);
            if (m.matches()) break;
            System.out.println("Ma sach sai, nhap lai");
        } while (true);

        do {
            System.out.print("Nhap ISBN: ");
            isbn = sc.nextLine();
            Matcher m = isbnPattern.matcher(isbn);
            if (m.matches()) break;
            System.out.println("ISBN sai, nhap lai");
        } while (true);

        do {
            System.out.print("Nhap nam xuat ban: ");
            nxb = sc.nextLine();
            Matcher m = yearPattern.matcher(nxb);
            if (m.matches() && Integer.parseInt(nxb) <= 2026) break;
            System.out.println("Nam xuat ban sai, nhap lai");
        } while (true);

        System.out.print("Nhap ten sach: ");
        ten = sc.nextLine();

        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();

        String[] words = ten.trim().split("\\s+");
        StringBuilder tenChuan = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String w = words[i].toLowerCase();
            tenChuan.append(w.substring(0,1).toUpperCase()).append(w.substring(1));
            if (i < words.length - 1) tenChuan.append(" ");
        }

        StringBuilder report = new StringBuilder();
        report.append("Ma sach: ").append(id).append("\n");
        report.append("ISBN: ").append(isbn).append("\n");
        report.append("Nam XB: ").append(nxb).append("\n");
        report.append("Ten sach: ").append(tenChuan.toString()).append("\n");
        report.append("Tac gia: ").append(tacGia);

        System.out.println(report.toString());

    }
}
