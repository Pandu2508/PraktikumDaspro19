import java.util.Scanner;

public class operatorLogikaWifi19 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean mahasiswa;
            boolean dosen;
            boolean akunDiblokir;

            System.out.print("Apakah pengguna mahasiswa? (true/false): ");
            mahasiswa = sc.nextBoolean();
            System.out.print("Apakah pengguna dosen? (true/false): ");
            dosen = sc.nextBoolean();
            System.out.print("Apakah akun diblokir? (true/false): ");
            akunDiblokir = sc.nextBoolean();

            if ((mahasiswa && dosen) && !akunDiblokir) {
                System.out.println("Akses WiFi diberikan");
            } else {
                System.out.println("Akses WiFi ditolak");
            }
        }
    }
}
