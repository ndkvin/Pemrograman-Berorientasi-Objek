import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally_Latihan_3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      int num = scanner.nextInt();
      if(num < 0) {
        throw new Exception("No negative");
      }
    } catch(Exception e) {
      System.out.println("Error" + e.getMessage());
    } 
    // catch(InputMismatchException e) {
    //   System.out.println("Invalid Entry");
    // }
  }
}
/*
 * Program akan menghasilkan error karena InputMismatchException sudah di handle oleh 
 * Exception. Hal ini karena InputMismatchException merupakan turunan atau meng-inherit dari
 * Exception.
 */
