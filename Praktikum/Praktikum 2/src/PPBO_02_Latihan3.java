// Nama : Andika Kavin Septiano
// NIM  : M0521011
public class PPBO_02_Latihan3 {
  String nim, nama, alamat;
  char jenisKelamin;

  /*
      Tulis kode kalian di sini
   */
  PPBO_02_Latihan3(String nim, String nama, char jenisKelamin, String alamat) {
    this.nim = nim;
    this.nama = nama;
    this.jenisKelamin = jenisKelamin;
    this.alamat = alamat;
  }

  public static void main(String[] args) {
      PPBO_02_Latihan3 mhs = new PPBO_02_Latihan3("M0501001", "Patrick Star", 'L', "Bikini Bottom");

      System.out.println(mhs.nim);
      System.out.println(mhs.nama);
      System.out.println(mhs.jenisKelamin);
      System.out.println(mhs.alamat);
  }
}


// Buatlah constructor untuk menginisiasi nilai dari variabel
// nim, nama, jenisKelamin, alamat