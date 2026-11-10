import java.util.Scanner;
public class PemilihanIf16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Cetak KRS SIAKAD ===");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = input.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverifikasi"); 
            System.out.println("Silakan Cetak KRS dan Minta Tanda Tangan DPA");
        } else {
            System.out.println("Registrasi Ditolak. Silakan Lunasi UKT Terlebih Dahulu");
        }

    input.close();
    }
}
