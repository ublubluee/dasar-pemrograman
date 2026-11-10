public class StudiKasus2 {
    public static void main(String[] args) {
        int lebar = 30;
        int panjang = 100;
        int diameterKolam = 5;
        int panjangSisiTaman = 2;
        double luasKolam = 3.14 * Math.pow(diameterKolam / 2.0, 2);
        double luasTaman = Math.pow(panjangSisiTaman, 2);
        double sisaTanah = (lebar * panjang) - (luasKolam + luasTaman);
        System.out.print("Sisa tanah yang tidak digunakan Pak Tono adalah " + sisaTanah);
    }
}