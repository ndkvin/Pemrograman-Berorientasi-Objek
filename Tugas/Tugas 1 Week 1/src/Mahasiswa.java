import java.util.Scanner; // library for input

public class Mahasiswa {

  private String nim, nama, jenisKelamin, alamat;
  
  Mahasiswa() {
    isiData();
    printData();
  }

  private void isiData() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your nim");
    nim = scanner.nextLine();
   
    System.out.println("Enter your nama");
    nama = scanner.nextLine();

    System.out.println("Enter your jenis kelamin");
    jenisKelamin = scanner.nextLine();

    System.out.println("Enter your alamat");
    alamat = scanner.nextLine();

    scanner.close();
  }

  private void printData() {
    System.out.println("Nim = " + nim);
    System.out.println("nama = " + nama);
    System.out.println("Jenis Kelamin = " + jenisKelamin);
    System.out.println("Alamat = " + alamat);
  }
}

