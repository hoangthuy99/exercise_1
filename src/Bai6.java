import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên thứ nhất: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ hai: ");
        int num2 = scanner.nextInt();

        System.out.print("Nhập số nguyên thứ ba: ");
        int num3 = scanner.nextInt();

        // Tìm số nguyên lớn nhất và nhỏ nhất
        int max = findMax(num1, num2, num3);
        int min = findMin(num1, num2, num3);

        // In kết quả ra màn hình console
        System.out.println("Số nguyên lớn nhất là: " + max);
        System.out.println("Số nguyên nhỏ nhất là: " + min);
    }

    // Phương thức tìm số nguyên lớn nhất
    private static int findMax(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    // Phương thức tìm số nguyên nhỏ nhất
    private static int findMin(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}

