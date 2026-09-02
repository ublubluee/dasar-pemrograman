import java.util.Scanner;
public class Bank16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTabunganAwal, lamaMenabung;
        double prosentaseBunga = 0.02, bunga, jumlahTabunganAkhir;

        System.out.print("Masukkan jumlah tabungan awal anda: ");
        jumlahTabunganAwal = sc.nextInt();
        System.out.print("Masukkan lama menabung anda: ");
        lamaMenabung = sc.nextInt();

        bunga = lamaMenabung*prosentaseBunga*jumlahTabunganAwal;
        jumlahTabunganAkhir = jumlahTabunganAwal + bunga;

        System.out.println("Jumlah bunga yang anda dapatkan adalah " + bunga);
        System.out.println("Jumlah tabungan akhir anda adalah " + jumlahTabunganAkhir);
    }
}
