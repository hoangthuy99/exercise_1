import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập bán kính của hình tròn: ");
            double radius = scanner.nextDouble();


            double circumference = Math.PI*radius*2;
            double area = Math.PI *Math.pow(radius,2);

            // In kết quả ra màn hình console với 2 số thập phân
            System.out.printf("Chu vi của hình tròn là: %.2f\n", circumference);
            System.out.printf("Diện tích của hình tròn là: %.2f\n", area);
        }



}
