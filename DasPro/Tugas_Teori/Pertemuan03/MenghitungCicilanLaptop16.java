import java.util.Scanner;
public class MenghitungCicilanLaptop16 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int lamaCicilan; //perbulan
        double hargaLaptop, uangMuka, bunga, sisaBayar, cicilan;
        bunga = 0.02;

        System.out.print("Masukkan harga laptop: Rp.");
        hargaLaptop = input.nextDouble();

        System.out.print("Masukkan DP Anda: Rp.");
        uangMuka = input.nextDouble();
        
        sisaBayar = hargaLaptop - uangMuka;
        System.out.print("Masukkan lama bayar cicilan Anda (bulan): ");
        lamaCicilan = input.nextInt();

        cicilan = (sisaBayar*bunga) + (sisaBayar / lamaCicilan);
        System.out.print("Total cicilan yang harus Anda bayar setiap bulan adalah Rp." + cicilan);


input.close();
    }
}