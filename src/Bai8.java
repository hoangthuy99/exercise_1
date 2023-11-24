import java.util.Calendar;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập năm sinh của bạn: ");
        int birthYear = scanner.nextInt();

        // Tính tuổi
        int age = calculateAge(birthYear);

        // Kiểm tra tuổi là chẵn hay lẻ
        String parity = (age % 2 == 0) ? "chẵn" : "lẻ";

        // In kết quả ra màn hình console
        System.out.println("Tuổi của bạn là: " + age);
        System.out.println("Tuổi là " + parity);
    }

    // Phương thức tính tuổi
    private static int calculateAge(int birthYear) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthYear;
    }
    
}
