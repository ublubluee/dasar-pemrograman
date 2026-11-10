public class StudiKasus1 {
    public static void main(String[] args) {
        double gajiPokok = 5000000;
        double tunjanganAnak = 100000;
        int jumlahAnak = 4;
        double danaPensiun = 0.10 * gajiPokok;
        double gajiBersih = gajiPokok + (tunjanganAnak * jumlahAnak) - danaPensiun;
        System.out.print("Gaji bersih yang diterima Pak Danur setiap bulan adalah " + gajiBersih);

    }
}
