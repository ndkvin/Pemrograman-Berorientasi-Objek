public class KaryawanTetap extends Karyawan{
  private double gaji, uangMakan, tunjangan;
  
  KaryawanTetap(String id, String nama, String alamat, double gaji, double uangMakan, double tunjangan) {
    super(id,nama,alamat);
    this.gaji = gaji;
    this.uangMakan = uangMakan;
    this.tunjangan = tunjangan;
  }


  public double hitungGaji() {
      return gaji+uangMakan+tunjangan;
  }
}
