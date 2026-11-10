import java.util.Scanner;
public class Tugas1Bioskop16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalTiketTerjual = 0;
        int hargaTiket = 50000;
        double totalPenjualanHarian = 0;
        double diskon = 0;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = input.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif. Silakan masukkan jumlah tiket yang valid.");
                continue;
            }

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }

            double hargaKotor = jumlahTiket * hargaTiket;
            double totalSetelahDiskon = hargaKotor - (hargaKotor * diskon);

            totalTiketTerjual += jumlahTiket;
            totalPenjualanHarian += totalSetelahDiskon;

            System.out.println("Total yang Harus Dibayar: Rp " + totalSetelahDiskon);
            System.out.print("Apakah ada transaksi lain? (y/n): ");
            input.nextLine();
            String jawaban = input.nextLine();

            if (!jawaban.equalsIgnoreCase("y")) {
                break;
            }
        } while (true);

        System.out.println("========== TOTAL PENJUALAN HARIAN ==========");
        System.out.println("Total Tiket Terjual Hari Ini: " + totalTiketTerjual);
        System.out.println("Total Penjualan Harian      : Rp. " + totalPenjualanHarian);

        input.close();
    }
}