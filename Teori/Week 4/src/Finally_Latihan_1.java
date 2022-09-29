import java.util.InputMismatchException;
import java.util.Scanner;

class Finally_Latihan_1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int num = scanner.nextInt();
      if(num>100) {
        //catch new Exception("Out of Bound");
        throw new Exception("Out of Bound");
      } 
    } catch(InputMismatchException e) {
      System.out.println("Invalid Entry");
    } catch (Exception e) {
      // handle Exception
      e.printStackTrace();
    } finally {
      System.out.println("Done");
    }
  }
}

/*
 * - Saat akan membuat Exception baru seharusnya menggunakan new bukan catch
 * - Untuk menghandle Exception yang diibuat dapat menggunakan catch, 
 *   bukan dengan menggunakan finally.
 */