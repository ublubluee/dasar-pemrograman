import java.util.Scanner;
public class StudiKasus3_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalSemua = 0;
        for ( int p = 1; p <= 3; p++) {
            System.out.println("Produk " + p);
            int totalProduk = 0;

            for (int h = 1; h<= 4; h++) {
                System.out.print(" Hari " + h + ": ");
                int jumlah = input.nextInt();
                totalProduk += jumlah;
            }
            System.out.println("Total produk " + p + " = " + totalProduk);
            totalSemua += totalProduk;
        }
        System.out.println("Total semua produk = " + totalSemua);

        input.close();
        
    }
}