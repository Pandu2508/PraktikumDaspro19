import java.util.Scanner;

public class sistemLMSKampus {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("========== Sistem LMS Kampus =========");
            System.out.print("Masukkan password Anda: ");
            String password = input.nextLine();
            System.out.print("Masukkan status perangkat Anda (Y/T): ");
            char statusPerangkat = input.next().charAt(0);
            System.out.print("Masukkan jumlah gagal login Anda : ");
            int jumlahGagal = input.nextInt();

            // Tingkat 1: Pemeriksaan Password
            if (password.equals("daspro2026")) {
                // Tingkat 2 (Password Benar): Pemeriksaan Status Perangkat
                if (statusPerangkat == 'Y' || statusPerangkat == 'y') {
                    System.out.println("Login berhasil, selamat datang di dashboard");
                } else if (statusPerangkat == 'T' || statusPerangkat == 't') {
                    System.out.println("Kode OTP telah dikirim ke email kampus Anda");
                } else {
                    System.out.println("Status perangkat tidak valid");
                }
            } else {
                if (jumlahGagal < 2) {
                    System.out.println("Password salah, silakan coba lagi");
                } else {
                    System.out.println("Akun dikunci selama 15 menit");
                }
            }
        }
    }
}