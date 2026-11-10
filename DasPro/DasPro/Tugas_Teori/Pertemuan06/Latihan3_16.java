import java.util.Scanner;
public class Latihan3_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan merk sepatu (Converse/Sketcher/Nike): ");
        String merkSepatu = input.nextLine().trim();
        System.out.print("Masukkan Kategori: ");
        String kategori = input.nextLine().trim();
        System.out.print("Masukkan ukuran sepatu: ");
        int ukuranSepatu = input.nextInt();
        int harga = 0;

        if (merkSepatu.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On") && ukuranSepatu <=40) {
                harga = 800000;
                System.out.println("Harga Sepatu Converse Slip On dengan ukutan tersebut adalah Rp." + harga);
            } else if (kategori.equalsIgnoreCase("High Top") && ukuranSepatu >= 40) {
                harga = 1200000;
                System.out.println("Harga Sepatu Converse High Top dengan ukuran tersebut adalah Rp." + harga);
            } else {
                System.out.println("Sepatu Converse kategori ini tidak tersedia");
            }
        } else if (merkSepatu.equalsIgnoreCase("Sketcher")) {
            if (kategori.equalsIgnoreCase("Woman") && ukuranSepatu <=41) {
                harga = 1000000;
                System.out.println("Harga Sepatu Sketcher Woman dengan ukuran tersebut adalah Rp." + harga);
            } else if (kategori.equalsIgnoreCase("Man") && ukuranSepatu >= 41) {
                harga = 1800000;
                System.out.println("Harga Sepatu Sketcher Man dengan ukuran tersebut adalah Rp." + harga);
            } else {
                System.out.println("Sepatu Sketcher kategori ini tidak tersedia");
            }
        } else if (merkSepatu.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids") && ukuranSepatu <= 40) {
                harga = 750000;
                System.out.println("Harga Sepatu Nike Kids dengan ukuran tersebut adalah Rp." + harga);
            } else if (kategori.equalsIgnoreCase("Adult") && ukuranSepatu >= 40) {
                harga = 1500000;
                System.out.println("Harga Sepatu Nike Adult dengan ukuran tersebut adalah Rp." + harga);
            } else {
                System.out.println("Sepatu Nike kategori ini tidak tersedia");
            }
        } else {
            System.out.println("Merk sepatu tidak dikenali.");
        }

    input.close();
    }
}
