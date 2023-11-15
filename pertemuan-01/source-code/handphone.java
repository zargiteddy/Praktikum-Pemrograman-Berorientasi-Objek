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