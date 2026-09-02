import java.util.Scanner;
public class StudiKasus1_Dinamis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
    double gajiPokok, tunjanganAnak, danaPensiun, gajiBersih;
    int jumlahAnak;

    System.out.print("Masukkan Gaji Pokok: ");
    gajiPokok = input.nextDouble();

    System.out.print("Masukkan Tunjangan Anak: ");
    tunjanganAnak = input.nextDouble();

    System.out.print("Masukkan Jumlah Anak: ");
    jumlahAnak = input.nextInt();

    danaPensiun = 0.10 * gajiPokok;
    gajiBersih = gajiPokok + (tunjanganAnak * jumlahAnak) - danaPensiun;

    System.out.println("Gaji bersih yang diterima Pak Danur setiap bulan adalah " + gajiBersih);
    }
}