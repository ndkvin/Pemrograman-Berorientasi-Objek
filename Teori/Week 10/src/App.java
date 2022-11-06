public class App {
  public static void main(String[] args) {
    KaryawanKontrak karyawanKontrak = new KaryawanKontrak("123", "Joko", "Surabaya", 150000, 28);
    System.out.println("Data karyawan kontrak");
    System.out.println("Id : " + karyawanKontrak.id);
    System.out.println("Nama : " +  karyawanKontrak.nama);
    System.out.println("Alamat : "+ karyawanKontrak.alamat);
    System.out.println("Gaji : " + karyawanKontrak.hitungGaji());

    System.out.println("\nData karyawan tetap");
    KaryawanTetap karyawanTetap = new KaryawanTetap("321", "Kojo", "Jakarta", 3000000,3500000,4000000);
    System.out.println("Id : " + karyawanTetap.id);
    System.out.println("Nama : " +  karyawanTetap.nama);
    System.out.println("Alamat : "+karyawanTetap.alamat);
    System.out.printf("Gaji : %7.2f\n", karyawanTetap.hitungGaji());
  }
}
