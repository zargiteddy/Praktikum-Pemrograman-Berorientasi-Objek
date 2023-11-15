class Mahasiswa {
   String nama;
   int noMhs;
   String prodi;
   String noHp;
   String alamat;

public void InfoMahasiswa (String nama,int noMhs,String prodi,String noHp,String alamat){
      this.nama = nama;
      this.noMhs = noMhs;
      this.prodi = prodi;
      this.noHp = noHp;
      this.alamat = alamat;
   }

   public void tampil(){
      System.out.println("Nama Mahasiswa: " +nama);
      System.out.println("Nomor Mahasiswa: " +noMhs);
      System.out.println("Prodi: " +prodi);
      System.out.println("Nomor Telepon: " +noHp);
      System.out.println("Alamat: " +alamat);
      System.out.println("");
   }
}

public class ObyekMahasiswa {
	public static void main (String[]args){
	Mahasiswa mahasiswa1=new Mahasiswa();
mahasiswa1.InfoMahasiswa("Raden",195410257,"S1 Informatika","085801285679","Bantul");
	mahasiswa1.tampil();

	Mahasiswa mahasiswa2=new Mahasiswa();
mahasiswa2.InfoMahasiswa("Isnawan",195410399," S1 Arkeologi","085801285738","Sleman");
	mahasiswa2.tampil();
	}
}