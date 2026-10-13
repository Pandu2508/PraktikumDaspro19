import java.util.Scanner;

public class TugasParkir19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            int tarifJamPertama = 2000, tarifjamBerikutnya = 1000, totalBiaya;
            System.out.println("----- Tugas Parkir -----");
            System.out.print("Masukan jumlah jam parkir : ");
            int lamaParkir = sc.nextInt();
            
            if (lamaParkir >= 2) {
                totalBiaya = tarifJamPertama + (lamaParkir - 2) * tarifjamBerikutnya;
                System.out.println("Biaya parkir: Rp. " + totalBiaya);
            } else {
                System.out.println("Biaya parkir: Rp. " + tarifJamPertama);
            }
        }
    }
}
