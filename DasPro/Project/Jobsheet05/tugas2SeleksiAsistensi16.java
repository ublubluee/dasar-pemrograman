import java.util.Scanner;
public class tugas2SeleksiAsistensi16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean statusMahasiswa, statusSanksi, sertifikatKompetisi; 
        int nilaiDaspro;
       
        System.out.println(" === PENDAFTARAN ASISTEN PRAKTIKUM ===");
        System.out.print("Apakah Anda merupakan mahasiswa aktif? (true/false): ");
        statusMahasiswa = input.nextBoolean();
        System.out.print("Apakah Anda sedang disanksi? (true/false): ");
        statusSanksi = input.nextBoolean();
        System.out.print("Masukkan nilai dasar pemrograman Anda: ");
        nilaiDaspro = input.nextInt();
        if (statusMahasiswa && !statusSanksi && nilaiDaspro >= 80) {
            System.out.print("Apakah Anda memiliki sertifikat kompetisi pemrograman? (true/false): ");
            sertifikatKompetisi = input.nextBoolean();
            if (sertifikatKompetisi == true) {
                System.out.println(" Selamat Anda memenuhi syarat untuk melanjutkan ke tahap wawancara seleksi asisten praktikum");
            } else {
                System.out.println("Maaf, Anda tidak memenuhi syarat untuk melanjutkan ke tahap wawancara seleksi asisten praktikum");
            }
        } else {
            System.out.println("Maaf, Anda tidak memenuhi syarat untuk melanjutkan ke tahap wawancara seleksi asisten praktikum");
        }

        System.out.println("=== HASIL SELEKSI ASISTEN PRAKTIKUM ===");
        System.out.print
        ("Masukkan nilai hasil wawancara Anda: ");
        int nilaiWawancara = input.nextInt();
        if (nilaiWawancara >= 75) {
                System.out.println("Selamat Anda diterima sebagai asisten praktikum");
        } else {
            System.out.println("Maaf, Anda tidak lolos tahapan seleksi asisten praktikum.");
        }

        
    input.close();

    }
}
