package Session03;

import java.util.Scanner;

public class Bai5 {
    static int deleteBook(int[] arr, int n, int bookId) {
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            return n;
        }
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }

    static void displayBooks(int[] arr, int n) {
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {101, 102, 103, 104, 105};
        int n = 5;

        while (n > 0) {
            System.out.print("Kho sach hien tai (" + n + " cuon): ");
            displayBooks(books, n);

            System.out.print("Nhap ma sach can xoa (0 de thoat): ");
            int id = sc.nextInt();

            if (id == 0) {
                break;
            }

            int newN = deleteBook(books, n, id);

            if (newN < n) {
                n = newN;
                System.out.println("Da xoa sach ma " + id);
            } else {
                System.out.println("Khong tim thay sach ma " + id);
            }
        }
    }
}
