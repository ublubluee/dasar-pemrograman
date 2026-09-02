import java.util.Scanner;
public class StudiKasus2_Dinamis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lebar, panjang, diameterKolam, panjangSisiTaman;
        double luasKolam, luasTaman, sisaTanah;

        System.out.print("Masukkan lebar tanah: ");
        lebar = input.nextInt();

        System.out.print("Masukkan panjang tanah: ");
        panjang = input.nextInt();

        System.out.print("Masukkan diameter kolam: ");
        diameterKolam = input.nextInt();

        System.out.print("Masukkan panjang sisi taman: ");
        panjangSisiTaman = input.nextInt();

        luasKolam = 3.14 * Math.pow(diameterKolam / 2.0, 2);
        luasTaman = Math.pow(panjangSisiTaman, 2);
        sisaTanah = (lebar * panjang) - (luasKolam + luasTaman);

        System.out.print("Sisa tanah yang tidak digunakan Pak Tono adalah " + sisaTanah);
    }
}