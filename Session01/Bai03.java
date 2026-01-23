package Session01;

public class Bai03 {
    public static void main(String[] args) {
        // book1 và book2 là biến tham chiếu, được lưu trên STACK
        // Giá trị của chúng là địa chỉ trỏ tới object String trong HEAP
        String book1 = "Java Basic";
        String book2 = "Python Intro";


        System.out.println("Trước khi hoán đổi: Book1 = " + book1 + ", Book2 = " + book2);
        // Lúc này:
        // STACK: book1 -> "Java Basic"
        //        book2 -> "Python Intro"
        // HEAP:  chứa 2 object String bất biến

        // temp cũng là biến tham chiếu trên STACK
        // temp trỏ tới cùng object String với book1
        String temp = book1;
        // Sau câu lệnh này:
        // STACK: temp  -> "Java Basic"
        //        book1 -> "Java Basic"
        // Không tạo String mới trong HEAP

        // book1 đổi tham chiếu, trỏ sang object mà book2 đang trỏ
        book1 = book2;
        // Sau câu lệnh này:
        // STACK: book1 -> "Python Intro"
        //        book2 -> "Python Intro"
        //        temp  -> "Java Basic"
        // HEAP không thay đổi

        // book2 đổi tham chiếu, trỏ sang object mà temp đang trỏ
        book2 = temp;

        // Kết quả cuối cùng:
        // STACK: book1 -> "Python Intro"
        //        book2 -> "Java Basic"
        // HEAP:  vẫn chỉ có 2 String ban đầu, không bị sửa đổi
        System.out.println("Sau khi hoán đổi: Book1 = " + book1 + ", Book2 = " + book2);
    }
}
