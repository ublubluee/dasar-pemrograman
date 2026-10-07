import java.util.Scanner;
public class nestedAksesLab16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean mahasiswaAktif, sedangDisanksi, punyaIzinDosen, asistenLab;

        System.out.print("Apakah Anda merupakan mahasiswa aktif? (true/false): ");
        mahasiswaAktif = input.nextBoolean();
        System.out.print("Apakah Anda sedang disanksi? (true/false): ");
        sedangDisanksi = input.nextBoolean();
        System.out.print("Apakah Anda memiliki izin dari dosen? (true/false): ");
        punyaIzinDosen = input.nextBoolean();
        System.out.print("Apakah Anda merupakan Asisten Lab? (true/false): ");
        asistenLab = input.nextBoolean();
        
        if (mahasiswaAktif && !sedangDisanksi) {
            if (punyaIzinDosen || asistenLab) {
                System.out.println("Akses laboratorium diberikan");
            } else {
                System.out.println("Akses ditolak: membutuhkan izin dosen atau status asisten lab");
            }
        } else {
            System.out.println("Akses ditolak: status mahasiswa tidak memenuhi syarat");
        }
        
        input.close();
    }
    
}
