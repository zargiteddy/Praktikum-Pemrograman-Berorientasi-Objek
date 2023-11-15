class PersegiPanjang {
  double panjang = 14.2;
  double lebar = 7.8;

  void hitungLuas()
    {
    double luas = panjang * lebar;
    System.out.println("Luas persegi panjang: " + luas); }

  void hitungKeliling()
    {
    double keliling = 2 * panjang + 2 * lebar;
    System.out.println("Keliling persegi panjang: " + keliling);
    }
}

public class ObyekPersegiPanjang {
  public static void main (String args []){
    PersegiPanjang persegipanjang1 = new PersegiPanjang();
    persegipanjang1.hitungLuas();
    persegipanjang1.hitungKeliling();
  }
}