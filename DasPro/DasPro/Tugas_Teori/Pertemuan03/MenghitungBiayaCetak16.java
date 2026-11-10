import java.util.Scanner;
public class MenghitungBiayaCetak16 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int jumlahLembar, biayaJilid, hargaPerLembar;
        double totalBayar;
        hargaPerLembar = 500;
        biayaJilid = 5000;

        System.out.print("Jumlah lembar yang dicetak: ");
        jumlahLembar = input.nextInt();

        totalBayar = (jumlahLembar*hargaPerLembar) + biayaJilid;
        System.out.print("Total yang harus Anda bayar adalah Rp. " + totalBayar);

        input.close();

    }
}