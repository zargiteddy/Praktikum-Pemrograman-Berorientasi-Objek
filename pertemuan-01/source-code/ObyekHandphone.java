class Handphone {
   String nama;
   String warna;
   String ram;
   String os;
   String harga;

public void InfoHP (String nama, String warna, String ram, String os, String harga){
      this.nama = nama;
      this.warna = warna;
      this.ram = ram;
      this.os = os;
      this.harga = harga;
   }

   public void tampil(){
      System.out.println("Nama Handphone \t: " +nama);
      System.out.println("Warna Handphone \t: " +warna);
      System.out.println("Kapasitas RAM \t: " +ram);
      System.out.println("Operating System \t: " +os);
      System.out.println("Harga Handphone \t: " +harga);
      System.out.println("");
   }
}

public class ObyekHandphone{
   public static void main (String[] args){
   	Handphone hp1=new Handphone();
   	hp1.InfoHP("LG K10 2017","black","4 GB","Andorid","Rp 3.000.000");
   	hp1.tampil();

   	Handphone hp2=new Handphone();
	hp2.InfoHP("Iphone 7+","rose gold","8 GB","iOS","Rp 7.000.000");
   	hp2.tampil();
   	}
}





