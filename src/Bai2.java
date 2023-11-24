import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài: ");
        float lenght = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập chiều rộng: ");
        float wight = Float.parseFloat(scanner.nextLine());
        float C = (lenght + wight)*2;
        float D = lenght*wight;

        System.out.println("Chu vi là :"+C);
        System.out.println("Diện tích là:"+D);

    }
}
