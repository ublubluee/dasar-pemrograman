import java.util.Scanner;
public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama Mahasiswa: ");
        String namaMahasiswa = input.nextLine();
        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = input.nextLine().trim();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") 
            || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Jumlah Dokumen: ");
            int jumlahDokumen = input.nextInt();

            if (jumlahDokumen <= 4) {
                System.out.print("Peringkat Juara: ");
                int juara = input.nextInt();  
                if (juara == 1 || juara == 2 || juara == 3) {
                System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    System.out.println("Status: Tidak berhak memperoleh dana penghargaan.");
                }
            } else {
            int kurang = 4 - jumlahDokumen;
            System.out.println("Status: Dokumen tidak lengkap, kurang " + kurang + " dokumen. Dana penghargaan tidak diberikan.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Jumlah dokumen : ");
            int jumlahDokumen = input.nextInt();

            if (jumlahDokumen == 4) {
                System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
                int pendanaan = input.nextInt();

                if (pendanaan == 1) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    System.out.println("Status: Tidak berhak memperoleh dana penghargaan karena tidak lolos pendanaan.");
                }
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }

        } else {
            System.out.println("Status: Kegiatan tidak memenuhi syarat untuk memperoleh dana penghargaan.");
        }

        input.close();

    }
}