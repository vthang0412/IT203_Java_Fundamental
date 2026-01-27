package Session03;

import java.util.Scanner;

public class Bai2 {

    static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {
                "Doraemon",
                "Conan",
                "One Piece",
                "Naruto",
                "Dragon Ball"
        };

        System.out.print("Nhap ten sach can tim: ");
        String search = sc.nextLine();

        int pos = searchBooks(books, search);

        if (pos != -1) {
            System.out.println("Tim thay sach '" + search + "' tai vi tri so: " + pos);
        } else {
            System.out.println("Sach khong ton tai trong thu vien.");
        }
    }
}
