public class LatihanKonstanta {
  public static final int KURS_DOLLAR = 15000;
  public static final double PI = 3.14;
  public static final String NAMA = "Squidward";

  public static void main(String args[]) {
    // KURS_DOLLAR = 13500;
    System.out.println(KURS_DOLLAR);
    System.out.println(PI);
    System.out.println(NAMA);
  }
}

/* 
Apa yang salah dengan source code tersebut?
mencoba untuk mengganti nilai yang disimapan pada variable KURS_DOLAR 
yang bersifat konstan, variable yang dideklarasikan dengan final 
(konstanta) tidak dapat diganti nilainya

Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
variable static digunakan agar variable yang ada di dalam class dapat diakses tanpa perlu membuat objek dari kelas tersebut terlebih dahulu
*/