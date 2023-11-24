import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Danh sách sinh viên");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập STT: ");
        int sTT = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ và tên: ");
        String stName = scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số ĐT: ");
        String phone = scanner.nextLine();
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("STT | Ho và tên | Tuổi | số ĐT | email:\n"+sTT+"|" +stName+"|" +age+"|" +phone +"|"+email);

    }
}
