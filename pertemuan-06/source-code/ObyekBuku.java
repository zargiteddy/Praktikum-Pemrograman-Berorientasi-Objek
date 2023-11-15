class Buku {
   private String judul;
   private int harga;
   private int halaman;

     public String getJudul() {
	 return judul;
     }
     public void setJudul(String judul) {
 	 this.judul = judul;
     }
     public long getHarga() {
	 return harga;
     }
     public void setHarga(int harga) {
 	 this.harga = harga;
     }
     public long getHalaman() {
   	 return halaman;
     }
     public void setHalaman(int halaman) {
 	 this.halaman = halaman;
     }

public void tampil()
 {
 System.out.println("Judulbuku :"+judul);
 System.out.println("Harga buku : "+harga);
 System.out.println("Jumlah halaman : "+halaman);
 }
 }
public class ObyekBuku
{
	public static void main(String[] args)
	    {
	     Buku buku1=new Buku();
	     buku1.setJudul("PBO");
	     buku1.setHarga(75000);
	     buku1.setHalaman(200);
	     buku1.tampil();

	     Buku buku2=new Buku();
	     buku2.setJudul("Inggris");
	     buku2.setHarga(60000);
	     buku2.setHalaman(150);
	     buku2.tampil();

	     Buku buku3=new Buku();
	     buku3.setJudul("Geografi");
	     buku3.setHarga(90000);
	     buku3.setHalaman(250);
	     buku3.tampil();
	    }
}