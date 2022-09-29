import java.util.InputMismatchException;
import java.util.Scanner;

public class Catch_Latihan_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Boolean lanjut = true;
    while(lanjut) {
      try {
        System.out.print("Enter input: ");
        int num = scanner.nextInt();
        lanjut = false;
      } catch(InputMismatchException e) {
        scanner.next();
        System.out.println("Invalid Entry");
      }
    }
  }
}

/*
 * Program tersebut masih akan meneruskan perulangan meskipun input yang
 * dimasukan benar. Untuk memerbaiki dapat memindah perulangan while. Perulangan while akan 
 * mengandung try catch. while akan mengecek variabel lanjut. jika input yang dimasukan 
 * masih salah maka akan menjalankan catch dan while akan berlanjut. Jika input yang 
 * dimasukan benar maka variabel lanjut akan dirubah menjadi false dan perulangan akan 
 * berhenti.
 */
