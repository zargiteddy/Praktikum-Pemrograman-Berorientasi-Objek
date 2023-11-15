class Pegawai {
   String nama;
   int nomorPeg;
   String bidang;
   String noHp;
   String alamat;

   public void InfoPegawai (String nama, int nomorPeg, String bidang, String noHp, String alamat){
      this.nama = nama;
      this.nomorPeg = nomorPeg;
      this.bidang = bidang;
      this.noHp = noHp;
      this.alamat = alamat;
   }

   public void tampil(){
      System.out.println("Nama Pegawai: " +nama);
      System.out.println("Nomor Pegawai: " +nomorPeg);
      System.out.println("Bidang: " +bidang);
      System.out.println("Nomor Telepon: " +noHp);
      System.out.println("Alamat: " +alamat);
      System.out.println("");
   }
}

public class ObyekPegawai {
	public static void main (String[]args){
		Pegawai pegawai1=new Pegawai();
		pegawai1.InfoPegawai("Raden",10905,"Cyber Security Engineer", "085801285679", "Yogyakarta");
		pegawai1.tampil();

		Pegawai pegawai2-new Pegawai();
		pegawai2.InfoPegawai("Argi",39201,"Network Engineer","085801285738","Klaten");
		pegawai2.tampil();
	}
}

