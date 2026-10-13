
import java.util.Scanner;

public class Studikasus219after {

    public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)) {
        double panjang, panjang_sisi, lebar, diameter;
        double luas_tanah, kolam_ikan, luas_taman_Bunga, luas_tanah_tidak_terpakai;
        System.out.print("Masukkan panjang tanah: ");
        panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar tanah: ");
        lebar = scanner.nextDouble();
        System.out.print("Masukkan diameter kolam ikan: ");
        diameter = scanner.nextDouble();
        System.out.print("Masukkan panjang sisi taman bunga: ");
        panjang_sisi = scanner.nextDouble();
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
}
