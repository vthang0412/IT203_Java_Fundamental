package Session07.Bai5;
class Config {
    public static final double MAX_SCORE = 10.0;
    public static final double MIN_SCORE = 0.0;
}

public class Bai5 {
    public static void main(String[] args) {
        double score = 8.5;
        if (score >= Config.MIN_SCORE && score <= Config.MAX_SCORE) {
            System.out.println("Điểm hợp lệ: " + score);
        }
        // ===== Thu thay doi gia tri =====
        // Config.MAX_SCORE = 20.0; // Loi bien dich
    }
}