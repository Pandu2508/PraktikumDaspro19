public class RobotArm19 {
    public static void main(String[] args) {
        String A = "Bola Bintang";
        String B = "Bola Bulan";
        String C = "";

        C = A;
        A = "";

        System.out.println("Setelah Langkah 1: ");
        System.out.println("nampan A = " + A);
        System.out.println("nampan B = " + B);
        System.out.println("nampan C = " + C);
       
        A = B;
        B = "";

        System.out.println("Setelah Langkah 2: ");
        System.out.println("nampan A = " + A);
        System.out.println("nampan B = " + B);
        System.out.println("nampan C = " + C);
       
        B = C;
        C = "";

        System.out.println("Setelah Langkah 3: ");
        System.out.println("nampan A = " + A);
        System.out.println("nampan B = " + B);
        System.out.println("nampan C = " + C);
        
        System.out.println("Kesimpulanya: " + "Pernyataan yang benar adalah " + B + " pindah tempat ke Nampan B dan " + A + " pindah tempat ke Nampan A");
    }
}
