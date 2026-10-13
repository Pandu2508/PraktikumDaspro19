
import java.util.Scanner;

public class AturanSeragamKuliah {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("========== Aturan Seragam Kuliah =========");
            System.out.println("1. Senin");
            System.out.println("2. Selasa");
            System.out.println("3. Rabu");
            System.out.println("4. Kamis");
            System.out.println("5. Jumat");
            System.out.println("6. Sabtu");
            System.out.println("7. Minggu");
            System.out.print("Masukkan kode hari (1-7): ");
            int kodeHari = input.nextInt();
            char statusSeragam;

            switch (kodeHari) {
                case 1, 2, 5 -> {
                    System.out.println("StatusSeragam ? (Y/N): ");
                    statusSeragam = input.next().charAt(0);
                    if (statusSeragam == 'Y') {
                        System.out.println("Boleh mengikuti perkuliahan");
                    } else {
                        System.out.println("Dikenakan sanksi dan tidak boleh mengikuti perkuliahan");
                    }
                }
                case 3, 4 ->
                    System.out.println("Pakaian bebas, rapih & sopan");
                case 6, 7 ->
                    System.out.println("Tidak ada perkuliahan");
                default ->
                    System.out.println("Kode hari tidak valid.");
            }

        }
    }
}
