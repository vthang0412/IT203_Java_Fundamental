package Session04;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine().trim();
        String author = sc.nextLine().trim();

        title = title.replaceAll("\\s+", " ").toUpperCase();

        String[] words = author.replaceAll("\\s+", " ").toLowerCase().split(" ");
        String authorFormatted = "";
        for (int i = 0; i < words.length; i++) {
            authorFormatted += words[i].substring(0, 1).toUpperCase() + words[i].substring(1) + " ";
        }
        authorFormatted = authorFormatted.trim();

        String result = "[" + title + "] - Tác giả: " + authorFormatted;
        System.out.println(result);
    }
}
