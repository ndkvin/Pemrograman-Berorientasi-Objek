public class ForLoopDemo {
  public static void main(String[] args) {
    int arr[] = { 5, 1, 4, 2, 3 };
    for (int i = 0; i < 5; i++) {
      System.out.println("elemen ke-" + i + " = " + arr[i]);
    }
  }
}

/* 
  Penulisan kode for diatas masih salah, index pada array dimulai dari 
  angka 0. Sehingga perulangan perlu perbaikan dengan mengganti 
  inisialisasi nilai i menjadi 0 dan mengganti kondisi dengan i < 5. 
*/ 