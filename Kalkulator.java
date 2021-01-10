import java.util.*;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int angka1, angka2, hasil;
        char operator;

        System.out.printf("======================================");
        System.out.printf("\n%30s", "Aplikasi Kalkulator");
        System.out.printf("\nMasukkan angka ke 1\t: ");
        angka1 = keyboard.nextInt();
        System.out.printf("Masukkan angka ke 2\t: ");
        angka2 = keyboard.nextInt();
        System.out.printf("======================================");
        System.out.print("\nPilih Operator ( +, -, x, / ) : ");
        operator = keyboard.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break;
            case 'x':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " x " + angka2 + " = " + hasil);
                break;
            case '/':
                double hasilBagi = (double) angka1 / (double) angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasilBagi);
                break;
            default:
                System.out.println("Operator Tidak Valid");
        }
    }
}