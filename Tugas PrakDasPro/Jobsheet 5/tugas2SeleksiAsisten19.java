import java.util.Scanner;

public class tugas2SeleksiAsisten19 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== SELEKSI CALON ASISTEN PRAKTIKUM ===");
            System.out.print("Apakah mahasiswa aktif? (true/false): ");
            boolean mahasiswaAktif = sc.nextBoolean();
            System.out.print("Apakah sedang disanksi akademik? (true/false): ");
            boolean sedangDisanksi = sc.nextBoolean();
            if (mahasiswaAktif && !sedangDisanksi) {
                System.out.print("Masukkan nilai Dasar Pemrograman: ");
                double nilaiDaspro = sc.nextDouble();
                System.out.print("Apakah memiliki sertifikat kompetensi? (true/false): ");
                boolean punyaSertifikat = sc.nextBoolean();
                if (nilaiDaspro >= 80 || punyaSertifikat) {
                    System.out.println("-> Anda lolos tahap berkas dan dipanggil wawancara.");
                    System.out.print("Masukkan nilai wawancara: ");
                    double nilaiWawancara = sc.nextDouble();
                    if (nilaiWawancara >= 75) {
                        System.out.println("Selamat! Anda DITERIMA sebagai Asisten Praktikum.");
                    } else {
                        System.out.println("Gagal! Nilai wawancara kurang dari 75.");
                    }
                } else {
                    System.out.println("Gagal! Nilai Daspro kurang dari 80 dan tidak memiliki sertifikat kompetensi.");
                }
            } else {
                System.out.println("Gagal! Status mahasiswa tidak aktif atau sedang menerima sanksi akademik.");
            }
        }
    }
}
