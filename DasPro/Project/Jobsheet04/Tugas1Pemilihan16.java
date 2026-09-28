import java.util.Scanner;
public class Tugas1Pemilihan16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("=== Cetak KRS SIAKAD ===");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = input.nextBoolean();

        String pesan = uktLunas
            ? "Pembayaran UKT Terverifikasi\nSilakan Cetak KRS dan Minta Tanda Tangan DPA"
            : "Registrasi Ditolak. Silakan Lunasi UKT Terlebih Dahulu";
        
        System.out.println(pesan);

    input.close();
    }
    
}
