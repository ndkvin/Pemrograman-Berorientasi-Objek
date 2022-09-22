// Nama : Andika Kavin Septiano
// NIM  : M0521011

public class PPBO_03_Latihan3 {
  public static void main(String[] args) {
      int arr[] = {5, 1, 4, 2, 3};
      // for (int i = 1; i < 6; i++) {
      //     System.out.println("elemen ke-" + i + " = " + arr[i]);
      // }

      // perbaikan
      for (int i = 0; i < 5; i++) {
          System.out.println("elemen ke-" + i + " = " + arr[i]);
      }

      // alternatif lain menggunakan foreach
      for(int i: arr) {
        System.out.println(i);
      }
  }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!

// Jawab:  
/* 
  Penulisan kode for diatas masih salah, index pada array dimulai dari 
  angka 0. Sehingga perulangan perlu perbaikan dengan mengganti 
  inisialisasi nilai i menjadi 0 dan mengganti kondisi dengan i < 5. 
  Alternatif lain untuk mengakses elemen setiap array dapat menggunakan 
  foreach
*/ 