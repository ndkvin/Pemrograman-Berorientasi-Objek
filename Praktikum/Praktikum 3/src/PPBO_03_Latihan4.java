// Nama : Andika Kavin Septiano
// NIM  : M0521011

public class PPBO_03_Latihan4 {
  public static void main(String[] args) {
      int arr[] = {5, 1, 4, 2, 3};
      // for (int i = 1; i < 6; i++) {
      //     System.out.println("elemen ke-" + i + " = " + arr[i]);
      // }

      //for
      for (int i = 0; i < 5; i++) {
        System.out.println("elemen ke-" + i + " = " + arr[i]);
      }
      int i =0;

      //do while
      do {  
        System.out.println("elemen ke-" + i + " = " + arr[i]);
        i++;
      } while(i != arr.length);
  }
}

// Melanjutkan source code Latihan3 yang sudah diperbaiki, ubahlah source code dengan 
// mengganti dari perulangan FOR menjadi menggunakan DO ... WHILE