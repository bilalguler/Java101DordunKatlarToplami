import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, total = 0;

        System.out.println("Lütfen çift sayı giriniz: ");

        do {
            n = scan.nextInt();
            if (n % 4 == 0) {
                total += n;
            }
        } while (n % 2 == 0);
        System.out.println("Çift ve dördün katlarının toplamı: " + total);
    }
}
