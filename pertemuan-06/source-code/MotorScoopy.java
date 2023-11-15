class SepedaMotor {
    private String merk;
    private String nama;
    private String warna;
    private String jenis;
    private int tahun;

    public String getMerk() {
        return merk;
}
   public void setMerk(String merk) {
        this.merk = merk;
}
   public String getNama() {
	    return nama;
}
   public void setNama(String nama) {
	    this.nama = nama;
}
   public String getWarna() {
		return warna;
}
   public void setWarna(String warna) {
		this.warna = warna;
}
  public String getJenis() {
		return jenis;
}
   public void setJenis(String jenis) {
		this.jenis = jenis;
}
  public long getTahun() {
		return tahun;
}
   public void setTahun(int tahun) {
		this.tahun = tahun;
}

public void cetakMotor(){
	System.out.println("==== MOTOR SAYA ====");
	System.out.println("Merk Motor: "+this.merk);
	System.out.println("Nama Motor: "+this.nama);
	System.out.println("Warna Motor: "+this.warna);
	System.out.println("Jenis Motor: "+this.jenis);
	System.out.println("Tahun produksi: "+this.tahun);
	System.out.println("====== ======= ======");
	}
}

public class MotorScoopy{
public static void main(String[] args) {
SepedaMotor Motor1=new SepedaMotor();
    Motor1.setMerk("Honda");
    Motor1.setNama("Scoopy");
    Motor1.setWarna("putih");
    Motor1.setJenis("scooter");
    Motor1.setTahun(2010);
    Motor1.cetakMotor();
    }
}