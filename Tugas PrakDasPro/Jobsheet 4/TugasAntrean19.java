import java.util.Scanner;
public class TugasAntrean19 {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.println("----- Tugas Antrean -----");
            System.out.println("1. Legalisir Ijazah");
            System.out.println("2. Surat Keterangan Aktif Kuliah");
            System.out.println("3. Pembayaran UKT");
            System.out.println("4. Pengajuan Cuti Akademik");   
            System.out.print("Pilih kode layanan (1-4) : ");
            int layanan = sc.nextInt();

            switch (layanan) {
                case 1:
                    System.out.println("Loket A");
                    break;
                case 2:
                    System.out.println("Loket B");
                    break;
                case 3:
                    System.out.println("Loket C");
                    break;
                case 4:
                    System.out.println("Loket D");
                    break;
                default:
                    System.out.println("Kode layanan tidak valid");
            }
        }
    }
}
