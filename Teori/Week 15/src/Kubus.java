/**
 * class kubus untuk melakukan perhitungan pada kubus
 */

public class Kubus {

  /**
   * Method untuk mnghitung volume kubus
   * @param sisi variabel sisi pada kubus
   * @return volume kubus
   */
  public double hitungVolume(double sisi) {
    double volume = 0;
    volume = sisi*sisi*sisi;

    return volume;
  }

  /**
   * Method untuk menghitung luas permukaan kubus
   * @param sisi variabel sisi pada kubus
   * @return luas permukaan kubus
   */
  public double hitungLuasPermukaan(double sisi) {
    double luasPermukaan = 0;
    luasPermukaan = 6*sisi;

    return luasPermukaan;
  }


  public static void main(String[] args) {
    Kubus kubus = new Kubus();
    System.out.println(kubus.hitungVolume(5));
  }
}
