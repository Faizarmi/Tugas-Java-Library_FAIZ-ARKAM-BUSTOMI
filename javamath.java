import java.math.BigDecimal;

public class javamath {

    public static void main(String[] args) {
        // Mendefinisikan dua bilangan BigDecimal
        BigDecimal num1 = new BigDecimal("12345678901234567890.123456789");
        BigDecimal num2 = new BigDecimal("98765432109876543210.987654321");

        // Penjumlahan
        BigDecimal sum = num1.add(num2);
        System.out.println("Penjumlahan: " + sum);

        // Pengurangan
        BigDecimal difference = num1.subtract(num2);
        System.out.println("Pengurangan: " + difference);

        // Perkalian
        BigDecimal product = num1.multiply(num2);
        System.out.println("Perkalian: " + product);

        // Pembagian
        BigDecimal quotient = num1.divide(num2, 20, BigDecimal.ROUND_HALF_UP); // Pembagian dengan 20 digit di belakang koma
        System.out.println("Pembagian: " + quotient);
    }
}