//  Nama    : Andika Kavin Septiano
//  NIM     : M0521011

class Car extends Thread{
  String name;

  public Car(String name){
      this.name = name;
  }

  @Override
  public void run() {
      System.out.println(name + " starts moving");

      try {
          Thread.sleep(3000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  }
}

public class PPBO_11_Latihan2 {
  public static void main(String[] args) {
      Car car1 = new Car("car1");
      Car car2 = new Car("car2");

      car1.start();
      car2.start();
  }
}

/*
* Jawablah pertanyaan berikut
* 1.   Jalankan source code ini sebanyak 10x, hitung berapa kali car1 dan car2 
*      sampai ke garis finish pertama kali (dilihat dari output terminal)!
*      Jawab: car1 9 kali car2 1 kali
* 
*      
* 2.   Mengapa setiap run, program bisa menghasilkan output yang berbeda padahal kode diimplementasi secara adil (setiap car "bergerak"
*      selama 3 detik) dan kode tidak ada yg diubah? Jelaskan!
*      Jawab: Thread yang ada pada program tidak saling berkomunikasi satu sama lain. Sehingga eksekusi thread akan bergantung pada penjadwalan proses yang ada di dalam sistem operasi. Ini yang menyebabkan hasil yang ditampilkan bisa berbeda-beda
* 
* 
* 3.   Anggap source code akan dimodifikasi menjadi:
*      print "{car} reaches finish line" (pada line 22) hanya dilakukan sekali dan hanya untuk car pertama yang mencapai garis finish 
*      Tanpa melakukan coding, berikan idemu supaya modifikasi di atas dapat dilakukan! 
*      Jawab: menggunakan variabel static dengan tipe data boolean (misalkan isFinish). Pada awal program variabel ini akan di set dengan nilai false. Jika salah satu thread sudah selesai dan akan menampilkan program maka akan melakukan pengecekkan dengan if. Apabila nilai dari isFinish adalah false maka program akan menampilkan "{car} reaches finish line" dan akan mengubah isFinish menjadi true. Setelah diubah menjadi true maka thread lain tidak akan menampilkan teks.
* 
* 
*/