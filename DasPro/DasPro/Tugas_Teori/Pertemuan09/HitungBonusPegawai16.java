import java.util.Scanner;
public class HitungBonusPegawai16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double jamKerja, gajiHarian, bonus;

        System.out.print("Masukkan jam kerja (negatif untuk berhenti): ");
        jamKerja = input.nextDouble();

        while (jamKerja >= 0) {
            System.out.print("Masukkan gaji harian: ");
            gajiHarian = input.nextDouble();

            if (jamKerja > 8) {
                bonus = 0.2 * gajiHarian;
                System.out.println("Bonus Pegawai: " + bonus);
            } else {
                bonus = 0;
                System.out.println("Tidak mendapat bonus.");
            }

            System.out.print("Masukkan jam kerja (negatif untuk berhenti): ");
            jamKerja = input.nextDouble();
            System.out.println("Progam Dihentikan.");

        }

        input.close();

    }
}
