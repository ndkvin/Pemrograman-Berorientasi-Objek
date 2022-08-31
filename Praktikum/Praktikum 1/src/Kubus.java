public class Kubus {
  int sisiKubus = 5;

  public Double hitungVolume() {
    Double volume = 0.0;
    volume = (this.sisiKubus * this.sisiKubus * this.sisiKubus)*1.0;
    return volume;
  }

  public int hitungLuasPermukaan() {
    int luasPermukaan = 0;
    luasPermukaan = 6 * this.sisiKubus *this.sisiKubus;
    return luasPermukaan;
  }

  public static void main(String[] args) {
    Kubus kubus = new Kubus();
    System.out.println("Volume Kubus :"+ kubus.hitungVolume());
    System.out.println("Luas Permukaan :"+ kubus.hitungLuasPermukaan());
  }
}
