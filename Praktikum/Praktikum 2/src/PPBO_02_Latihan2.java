// Nama : Andika Kavin Septiano
// NIM  : M0521011
public class PPBO_02_Latihan2 {
  public static int KURS_DOLLAR = 15000;
  public static final double PI = 3.14;
  public static final String NAMA = "Squidward";
  public static void main(String args[]) {
      // KURS_DOLLAR = 13500;
      System.out.println(KURS_DOLLAR);
      System.out.println(PI);
      System.out.println(NAMA);
  }
}
// Apa yang salah dengan source code tersebut?
// Jawaban : mencoba untuk mengubah nilai pada constanta KURS_DOLLAR, 
// nilai yang disimpan pada konstanta tidak dapat diganti sehingga 
// ketika mencoba untuk mengganti konstanta akan terajdi error
// Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
// Jawaban : 
// static digunakan untuk menghemat penggunaan memori karena variable atau method yang dibuat dengan ketword static hanya disimpan pada satu lokasi pada memori
// static digunakan untuk mengakses variable atau static dari suatu class tanpa harus membuat object dari class tersebut