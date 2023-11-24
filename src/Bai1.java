import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên: ");
        int number = scanner.nextInt();
        int square = calculateSquare(number);
        System.out.printf("Bình phương : %s là %s ",number,square);
    }
    private static int calculateSquare(int num) {
        return num * num;
    }

}
