import java.util.Scanner;

public class ExceptionDemo1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ketik bilangan pertama : ");
    int bil1 = sc.nextInt();
    System.out.print("Ketik bilangan kedua : ");
    int bil2 = sc.nextInt();
    double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
    System.out.println(bil1 + " / " + bil2 + " = " + hasil);
  }
}

/*
 * a. Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
      -Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
      Tidak

      -Tulis output yang muncul!
      Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at ExceptionDemo1.main(ExceptionDemo1.java:7)

      -Jelaskan maksud dari output tersebut!
      error InputMismatchException merupakan error yang muncul karena kesalahan masukan, program seharusnya menerima masukan berupa integer tetapi kita memasukan data bertipe char/huruf sehingga akan membangkitkan InputMismatchException error.
  b. Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input bilangan kedua. Jelaskan output yang muncul!
      -Tulis output yang muncul!
      Infinity
      
      -Jelaskan maksud dari output tersebut!
      program mengeluarkan infinity terjadi pembagian dengan nol, semua bilangan yang dibagi dengan nol akan menghasilkan infinity
 */