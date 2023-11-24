import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên có 4 chữ số: ");
        int number = scanner.nextInt();

        // Kiểm tra xem số có đúng là số nguyên có 4 chữ số không
        if (isValidNumber(number)) {
            // Tính tổng các chữ số
            int sum = calculateSumOfDigits(number);

            // Tính số nghịch đảo
            int reversedNumber = reverseNumber(number);

            // In kết quả ra màn hình console
            System.out.println("Tổng các chữ số là: " + sum);
            System.out.println("Số nghịch đảo là: " + reversedNumber);
        } else {
            System.out.println("Số nhập vào không có 4 chữ số. Hãy thử lại.");
        }
    }

    // Phương thức kiểm tra xem số có 4 chữ số hay không
    private static boolean isValidNumber(int num) {
        return num >= 1000 && num <= 9999;
    }

    // Phương thức tính tổng các chữ số
    private static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Phương thức tính số nghịch đảo
    private static int reverseNumber(int num) {
        int reversedNumber = 0;
        while (num > 0) {
            reversedNumber = reversedNumber * 10 + num % 10;
            num /= 10;
        }
        return reversedNumber;
    }
}

