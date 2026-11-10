import java.util.Scanner;
public class GajiKaryawan16 {
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);

        int gajiPokok;
        double bonus, pajak, totalGaji, tunjanganTransportasi, tunjanganMakan;
        tunjanganTransportasi = 600000.0;
        tunjanganMakan = 400000.0;

        System.out.print("Masukkan Gaji Pokok Anda: ");
        gajiPokok = input.nextInt();
        
        bonus = 0.05*gajiPokok;
        System.out.println("Bonus Bulanan Anda adalah " + bonus);

        pajak = 0.1;
        totalGaji = gajiPokok+tunjanganTransportasi+tunjanganMakan+bonus - (pajak*gajiPokok);
        System.out.println("Gaji yang Anda terima adalah sebesar Rp." + (int) totalGaji);

input.close();
    }
    
}
