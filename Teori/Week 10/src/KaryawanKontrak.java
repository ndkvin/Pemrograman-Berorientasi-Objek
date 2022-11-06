public class KaryawanKontrak extends Karyawan{
  private double gajiHarian;
  private int jumlahHariMasuk;
  
  KaryawanKontrak(String id, String nama, String alamat, double gajiHarian, int jumlahHariMasuk) {
    super(id,nama,alamat);
    this.gajiHarian = gajiHarian;
    this.jumlahHariMasuk = jumlahHariMasuk;
  }


  public double hitungGaji() {
      return gajiHarian*jumlahHariMasuk;
  }
}
