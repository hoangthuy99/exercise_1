import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm môn Toán: ");
        double toan = scanner.nextDouble();

        System.out.print("Nhập điểm môn Văn: ");
        double van = scanner.nextDouble();

        System.out.print("Nhập điểm môn Anh: ");
        double anh = scanner.nextDouble();

        // Tính tổng điểm và điểm trung bình
        double tongDiem = toan + van + anh;
        double diemTrungBinh = tongDiem / 3;

        // In kết quả ra màn hình console với độ chính xác 2 số thập phân
        System.out.printf("Tổng điểm: %.2f\n", tongDiem);
        System.out.printf("Điểm trung bình: %.2f\n", diemTrungBinh);
    }
}
