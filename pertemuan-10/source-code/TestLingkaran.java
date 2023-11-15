interface Bangun2D{
 public double hitungLuas();
  public double hitungKeliling();
}

interface Bangun3D{
	public double hitungVolume();
	public void tampilInfo();
}

interface Pola{
	public void setWarna();
	public void getWarna();
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
	private String warna;
	 private String info;

public void setInfo(String info) {
    this.info = info;
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

public void setWarna(){
	this.warna = warna;
}
public getWarna(){
	return this.warna;
}

public double hitungVolume(){
	return (3.14 * this.radius * this.radius * this.tinggi)
    }
}
public void tampilInfo(){
    System.out.println(this.info+": warna tabung adalah "+this.warna);
}

class TestBangun{
  public static void main(String[] args){
    Lingkaran bunder = new Lingkaran();
    bunder.setJejari(10);
    double luas = bunder.hitungLuas();
    double keliling = bunder.hitungKeliling();
System.out.println("Luas lingkaran dengan jejari "
                  +bunder.getJejari()+ " adalah "+luas);
System.out.println("Keliling lingkaran dengan jejari "
                  +bunder.getJejari()+" adalah "+keliling);

    Tabung tab = new tabung();
    tab.setRadius(12);
    double volume = tab.hitungVolume();
    System.out.println("Volume tabung dengan radius "+tab.getRadius() +
                      " adalah " + volume);
    t.setInfo("info tabung");
    t.tampilInfo();


	}
}