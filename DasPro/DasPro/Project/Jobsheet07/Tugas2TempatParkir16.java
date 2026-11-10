import java.util.Scanner;
public class Tugas2TempatParkir16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis, durasi, total = 0;

        System.out.println("=== Jenis Kendaraan ===");
        System.out.println("1. Mobil (Rp 3000/jam)");
        System.out.println("2. Motor (Rp 2000/jam)");

        do {
            System.out.print("Masukkan jenis kendaraan (0 untuk keluar): ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = input.nextInt();

                if (jenis == 1) {
                    total = durasi * 3000;
                } else {
                    total = durasi * 2000;
                }
                System.out.println("Total pembayaran parkir: Rp " + total);
            } else if (jenis == 0) {
                System.out.println("Program dihentikan.");
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
            }
        } while (jenis != 0);

        input.close();
    }
}
