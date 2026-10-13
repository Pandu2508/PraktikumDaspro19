
import java.util.Scanner;

public class Kuis19 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            final double lari = 0.07;
            final double renang = 0.08;
            final double bersepeda = 0.09;

            double totKal;
            double ratKal;
            double berBad;
            double kalLar;
            double kalRe;
            double kalBer;
            double perCap;
            double capHar;
            int durasi;
            double kecrat;
            int ketinggian;

            System.out.print("Masukan target capaian kalori hari ini : ");
            capHar = input.nextDouble();

            System.out.print("Masukan berat badan (kg) : ");
            berBad = input.nextDouble();

            System.out.print("Masukan berapa lama durasi setiap aktivitas (menit) : ");
            durasi = input.nextInt();

            System.out.print("Masukan ketinggian tempat latihan (meter) : ");
            ketinggian = input.nextInt();

            System.out.print("Masukan kecepatan rata-rata (km/jam) : ");
            kecrat = input.nextDouble();

            if (capHar <= 0) {
                System.out.println("Target kalori harus lebih dari 0!");
                return;
            }

            kalLar = (durasi * lari * berBad) + (kecrat * 0.5) + (ketinggian * 0.01);
            kalRe = (durasi * renang * berBad) + (kecrat * 0.5) + (ketinggian * 0.01);
            kalBer = (durasi * bersepeda * berBad) + (kecrat * 0.5) + (ketinggian * 0.01);

            totKal = kalLar + kalRe + kalBer;
            ratKal = totKal / (durasi * 3.0);
            perCap = (totKal / capHar) * 100;

            System.out.println("Kalori yang terbakar di aktivitas lari : " + kalLar);
            System.out.println("Kalori yang terbakar di aktivitas Renang : " + kalRe);
            System.out.println("Kalori yang terbakar di aktivitas Bersepeda : " + kalBer);
            System.out.println("Total Kalori yang terbakar di semua aktivitas : " + totKal);
            System.out.println("Rata-Rata kalori yang terbakar per menit : " + ratKal);
            System.out.println("Persentase capaian terhadap target kalori harian : " + perCap + "%");
        }
    }
}
