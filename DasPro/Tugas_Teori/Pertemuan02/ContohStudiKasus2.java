package Tugas_Teori.Pertemuan02;
import java.util.Scanner;

public class ContohStudiKasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

         System.out.print("Masukkan jumlah tabungan awal: ");
        int jumlahTabunganAwal = input.nextInt();

        System.out.print("Masukkan lama menabung (tahun): ");
        int lamaMenabung = input.nextInt();

        System.out.print("Masukkan bunga (dalam %): ");
        double bunga = input.nextDouble();
        bunga = bunga / 100;

        double jumlahTabunganAkhir = jumlahTabunganAwal * Math.pow(1 + bunga, lamaMenabung);
        //rumus bunga majemuk
        double totalBunga = jumlahTabunganAkhir - jumlahTabunganAwal;

        System.out.println("------------------------------------");
        System.out.println("Total bunga tabunga Anda adalah " + totalBunga);
        System.out.print("Jumlah tabungan akhir Anda adalah " + jumlahTabunganAkhir);

        }
    }

