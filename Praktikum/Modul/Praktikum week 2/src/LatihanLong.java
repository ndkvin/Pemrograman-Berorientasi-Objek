public class LatihanLong {
  public static void main(String args[]) {
    long p = 2147483648L;
    System.out.println(p);
  }
}

/* 
Apa maksud dari pesan error yang muncul?
compailer mendeteksi variable p sebagai int karena, nilai yang dimasukan
pada p tidak diakhri dengan L sebagai tanda bahwa nilai tersebut berupa
long

Bagaimana memperbaiki source code tersebut?
dengan menambahkan L pada akhir nilai yang dimasukan pada variable p 
*/