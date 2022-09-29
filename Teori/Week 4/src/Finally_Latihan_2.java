import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally_Latihan_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      int num = scanner.nextInt();
      if(num < 0) {
        throw new Exception("No negative");
      }
    } catch(InputMismatchException e) {
      System.out.println("Invalid Entry");
    } catch(Exception e) {
      System.out.println("Error" + e.getMessage());
    } finally {
      System.out.println("Done");
    }
  }
}
/*
 * Program akan mengeksekusi blok kode catch pertama, karena terjadi kesalahan input. 
 * Setelah itu program akan menjalankan blok kode finally.
 */
