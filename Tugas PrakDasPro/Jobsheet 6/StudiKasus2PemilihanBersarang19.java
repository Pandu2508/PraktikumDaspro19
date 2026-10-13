import java.util.Scanner;

public class StudiKasus2PemilihanBersarang19 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nama mahasiswa : ");
            String nama = scanner.nextLine();

            System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
            String jenisKegiatan = scanner.nextLine();

            if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
                jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
                jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

                System.out.print("Jumlah dokumen : ");
                int jumlahDokumen = scanner.nextInt();
                System.out.print("Peringkat juara : ");
                int peringkatJuara = scanner.nextInt();

                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    if (jumlahDokumen == 4) {
                        System.out.println("Status : Berhak memperoleh dana penghargaan.");
                    } else {
                        int kurang = 4 - jumlahDokumen;
                        System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                    }
                } else {
                    System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
                }

            } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

                System.out.print("Jumlah dokumen : ");
                int jumlahDokumen = scanner.nextInt();
                System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
                int statusPKM = scanner.nextInt();

                if (statusPKM == 1) {
                    if (jumlahDokumen == 4) {
                        System.out.println("Status : Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                    } else {
                        int kurang = 4 - jumlahDokumen;
                        System.out.println("Status : Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                    }
                } else {
                    System.out.println("Status : Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
                }

            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
            }
        }
    }
}