interface Bangun2D{
 public double hitungLuas();
  public double hitungKeliling();
}

interface Bangun3D{
	public double hitungVolume();
	public void tampilInfo();
	public void setInfo(String info);
}

interface Pola{
	public void Warna();
	public void setWarna(String warna);
}

class Lingkaran implements Bangun2D{
   private double jejari;
     public void setJejari(double jejari){
       this.jejari=jejari;
}
   public double getJejari(){
   return this.jejari;
}
   public double hitungLuas(){
   return (3.14 * this.jejari * this.jejari);
}
   public double hitungKeliling(){
   return (2 * 3.14 * this.jejari);
   }
}

class Tabung implements Bangun3D, Pola{
	private double tinggi;
	private double radius;
	 private String info;
	 private String warna;

public void setInfo(String info) {
    this.info = info;
  }
public void setWarna(String warna) {
    this.warna = warna;
  }

public void setTinggi(double tinggi){
	this.tinggi = tinggi;
}
public void setRadius(double radius){
	this.radius = radius;
}
public double getTinggi(){
	return this.tinggi;
}
public double getRadius(){
	return this.radius;
}
public double hitungVolume(){
	return (3.14 * this.radius * this.radius * this.tinggi);
    }

public void tampilInfo(){
    System.out.println(this.info+": tabung keren ");
}
public void Warna(){
	System.out.println("warna tabung adalah "+ this.warna);
}}

public class TestBangun{
  public static void main(String[] args){
    Lingkaran bunder = new Lingkaran();
    bunder.setJejari(10);
    double luas = bunder.hitungLuas();
    double keliling = bunder.hitungKeliling();
System.out.println("Luas lingkaran dengan jejari "
                  +bunder.getJejari()+ " adalah "+luas);
System.out.println("Keliling lingkaran dengan jejari "
                  +bunder.getJejari()+" adalah "+keliling);

    Tabung tab = new Tabung();
    tab.setRadius(12);
    tab.setTinggi(24);
    double volume = tab.hitungVolume();
    System.out.println("Volume tabung dengan radius "+tab.getRadius() +
                      " adalah " + volume);
    tab.setInfo("info tabung");
    tab.setWarna("merah");
    tab.tampilInfo();
    tab.Warna();
	}
}