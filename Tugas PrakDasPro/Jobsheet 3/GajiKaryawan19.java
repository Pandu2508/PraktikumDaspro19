import java.util.Scanner;
public class GajiKaryawan19 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
        int gajiPokok, totGaji;
        double tunjTransp = 600000, tunjMkn = 400000, bonus;

        System.out.print("Masukkan gaji pokok: ");
        gajiPokok = input.nextInt();

        bonus = gajiPokok * 0.05;
        totGaji = (int) ((int) gajiPokok + tunjTransp + tunjMkn + bonus - (gajiPokok * 0.1));

        System.out.println("Total Bonus: " + bonus);
        System.out.println("Total gaji karyawan adalah: " + totGaji);
        }
    }
}
