class Mobil {
   String plat;
   String warna;
   String manufaktur;
   int kecepatan;
   String arah;
   String rem;
   int perubahan;

public void setMobil (String plat, String warna, String manufaktur, int kecepatan){
      this.plat=plat;
      this.warna=warna;
      this.manufaktur=manufaktur;
      this.kecepatan=kecepatan;
   	  }
   public void akselerasi(int perubahan){
      this.perubahan = perubahan+kecepatan;
   }
   public void belok(String arah){
      this.arah=arah;
   }
   public void rem(String rem){
      this.rem=rem;
   	  }
      public void tampil(){
      System.out.println("Nomor Plat \t: "+plat);
      System.out.println("Warna \t: "+warna);
      System.out.println("Manufaktur \t: "+manufaktur);
      System.out.println("Kecepatan \t: "+kecepatan+" km/h");
      System.out.println("Akselerasi \t: "+perubahan+" km/h");
      System.out.println("Arah Belok \t: "+arah);
      System.out.println("Kondisi Rem \t: "+rem);
      System.out.println("");
   }
}

public class ObyekMobil{
	public static void main (String[] args){
		Mobil mobilA = new Mobil();
		mobilA.setMobil("DK 2473 KL","Putih","Honda",60);
		mobilA.akselerasi(30);
		mobilA.belok("kanan/kiri");
		mobilA.rem("Berfungsi");
		mobilA.tampil();

		Mobil mobilB = new Mobil();
		mobilB.setMobil("DK 1958 KL","Hitam","Ford",90);
		mobilB.akselerasi(30);
		mobilB.belok("kanan/kiri");
		mobilB.rem("Berfungsi");
		mobilB.tampil();
}
}

