public class Studikasus219before {
    public static void main(String[] args) {
        int panjang, panjang_sisi, lebar, diameter, luas_tanah;
        double kolam_ikan, luas_taman_Bunga, luas_tanah_tidak_terpakai;
        panjang = 100;
        lebar = 30;
        diameter = 5;
        panjang_sisi = 2;
        luas_tanah = panjang * lebar;
        kolam_ikan = 3.14 * (diameter / 2) * (diameter / 2);
        luas_taman_Bunga = panjang_sisi * panjang_sisi;
        luas_tanah_tidak_terpakai = (luas_tanah - kolam_ikan - luas_taman_Bunga);
        System.out.println("Luas Tanah: " + luas_tanah);
        System.out.println("Luas Kolam Ikan: " + kolam_ikan);
        System.out.println("Luas Taman Bunga: " + luas_taman_Bunga);
        System.out.println("Luas Tanah Tidak Terpakai: " + luas_tanah_tidak_terpakai);
    }
}