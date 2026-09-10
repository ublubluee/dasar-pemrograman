import java.util.Scanner;
public class Tugas2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int jumlahLembar, jilid, hargaPerLembar;
        double totalBayar;
        hargaPerLembar = 500;
        jilid = 5000;

        System.out.print("Jumlah lembar yang dicetak: ");
        jumlahLembar = input.nextInt();

        totalBayar = (jumlahLembar*hargaPerLembar) + jilid;
        System.out.print("Total yang harus Anda bayar adalah Rp. " + totalBayar);

        input.close();

    }
    
}
