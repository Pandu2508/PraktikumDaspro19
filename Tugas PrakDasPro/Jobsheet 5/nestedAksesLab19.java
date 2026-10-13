import java.util.Scanner;
public class nestedAksesLab19 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Apakah mahasiswa aktif? (true/false): ");
            boolean mahasiswaAktif = input.nextBoolean();
            System.out.print("Apakah mahasiswa sedang disanksi? (true/false): ");
            boolean sedangDisanksi = input.nextBoolean();
            System.out.print("Apakah mahasiswa punya izin dosen? (true/false): ");
            boolean punyaIzinDosen = input.nextBoolean();
            System.out.print("Apakah mahasiswa adalah asisten laboratorium? (true/false): ");
            boolean asistenLab = input.nextBoolean();

            if (mahasiswaAktif && !sedangDisanksi) {
                if (punyaIzinDosen || asistenLab) {
                    System.out.println("Akses laboratorium diberikan");
                } else {
                    System.out.println("Akses laboratorium ditolak: Membutuhkan izin dosen atau status asisten lab");
                }
            } else {
                System.out.println("Akses laboratorium ditolak: Status mahasiswa tidak memenuhi syarat");
            }
        }
    }
}
