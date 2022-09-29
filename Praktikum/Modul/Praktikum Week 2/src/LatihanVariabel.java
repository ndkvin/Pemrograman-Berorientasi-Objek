public class LatihanVariabel {
  public static void main(String[] args) {
    int a = 10;
    double b = 3.0;
    float c = 4.3f;
    // ubah variabel a dan c ke tipe data double
    double A = (double)a;
    double C = (double)c;
    // jumlahkan variabel a, b, dan c
    double hasil = A+b+C;
    // tampilkan hasil penjumlahan ketiga variabel
    System.out.printf("%.1f\n",hasil);
  }
}