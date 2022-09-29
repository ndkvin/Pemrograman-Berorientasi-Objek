import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nilai : ");
        double nilai = scanner.nextDouble();

        if(nilai<55) {
          System.out.println("Nilai Anda E");
        } else if(nilai < 60) {
          System.out.println("Nilai Anda D");
        } else if(nilai < 65) {
          System.out.println("Nilai Anda C");
        } else if(nilai < 70) {
          System.out.println("Nilai Anda C+");
        } else if(nilai < 75) {
          System.out.println("Nilai Anda B");
        } else if(nilai < 80) {
          System.out.println("Nilai Anda B+");
        } else if(nilai < 85) {
          System.out.println("Nilai Anda A-");
        } else {
          System.out.println("Nilai Anda A");
        }
    }
}
