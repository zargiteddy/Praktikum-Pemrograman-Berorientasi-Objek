public class Bus extends Mobil {
  protected String speksifikasi;
  protected String warna;
  protected String merk;

public Bus(int kecmaks, String namaken, String speksifikasi,
           String warna, String merk ){

    super(kecmaks, namaken);
    this.speksifikasi = speksifikasi;
    this.warna = warna;
    this.merk = merk;
}

@Override
public void PrintInfoMobil() {
    super.PrintInfoMobil();
    System.out.println("Spesifikasi:"+ speksifikasi);
    System.out.println("Warna:"+ warna);
    System.out.println("Merk:"+ merk);
    }
}

