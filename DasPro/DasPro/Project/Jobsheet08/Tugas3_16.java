import java.util.Scanner;
public class Tugas3_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = input.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalSemua = 0;
            int barangTerbanyak = -1;   // -1 karena total barang boleh 0
            int tokoTerbanyak = 0;

            int t = 1;
            while (t <= jumlahToko) {
                System.out.println("Toko " + t);

                int jumlahPelanggan;
                do {
                    System.out.print("  Jumlah pelanggan: ");
                    jumlahPelanggan = input.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("  Tidak boleh negatif. Ulangi input!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;
                for (int p = 1; p <= jumlahPelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("    Barang pelanggan " + p + ": ");
                        barang = input.nextInt();
                        if (barang < 0) {
                            System.out.println("    Tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);
                    totalBarangToko += barang;
                }

                System.out.println("Toko " + t + " - pelanggan: " + jumlahPelanggan
                        + ", total barang: " + totalBarangToko);
                totalSemua += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = t;
                }
                t++;
            }

            System.out.println("Total barang seluruh toko: " + totalSemua);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        
        input.close();
    }
}   
