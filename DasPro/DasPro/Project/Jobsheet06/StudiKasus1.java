import java.util.Scanner;
public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahCup, uangBayar, totalHarga, totalBayar, kembalian, kurang;
        int hargaPerCup = 18000;
        int diskon = 0;

        System.out.print("Masukkan Jumlah Cup: ");
        jumlahCup = input.nextInt();
        System.out.print("Masukkan Uang Bayar: Rp.");
        uangBayar = input.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
            totalBayar = totalHarga - diskon;
        } else {
            diskon = 0;
            totalBayar = totalHarga;
        }

        kurang = totalBayar - uangBayar;
        kembalian = uangBayar - totalBayar;
        
        System.out.println("Total Harga: Rp." + totalHarga);
        System.out.println("Diskon: Rp." + diskon);
        System.out.println("Total Bayar: Rp." + totalBayar);
        kurang = totalBayar - uangBayar;
        kembalian = uangBayar - totalBayar;

        if (uangBayar >= totalBayar) {
            System.out.println("Kembalian Anda Sebesar Rp." + kembalian);
        } else {
            System.out.println("Uang tidak cukup, kurang Rp." + kurang);
        }

        input.close();
    }
}