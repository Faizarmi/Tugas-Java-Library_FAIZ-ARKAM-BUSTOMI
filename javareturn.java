import java.util.Scanner;

public class javareturn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        System.out.print("Pilih operasi (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double hasil = hitung(angka1, angka2, operator);
        System.out.println("Hasil: " + hasil);

        scanner.close();
    }

    public static double hitung(double angka1, double angka2, char operator) {
        double hasil = 0;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("Operator tidak valid!");
        }

        return hasil;
    }
}
