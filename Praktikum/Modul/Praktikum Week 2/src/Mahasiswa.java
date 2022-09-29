public class Mahasiswa {
  String nim, nama, alamat;
  char jenisKelamin;

  // buatlah constructor untuk menginisiasi nilai dari variabel
  // nim, nama, jenisKelamin, alamat
  Mahasiswa(String nim, String nama, char jenisKelamin, String alamat) {
    this.nim = nim;
    this.nama = nama;
    this.alamat = alamat;
    this.jenisKelamin = jenisKelamin;
  }
  public static void main(String[] args) {
    Mahasiswa mhs = new Mahasiswa("M0501001", "Patrick Star", 'L', "Bikini Bottom");
    System.out.println(mhs.nama);
    System.out.println(mhs.nim);
    System.out.println(mhs.jenisKelamin);
    System.out.println(mhs.alamat);
  }
}