class Buku
{
		String judul;
	int harga;
int halaman;
public void setBuku(String judul,int harga,int halaman)
{
this.judul=judul;
	this.harga=harga;
		this.halaman=halaman;
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
	buku1.setBuku("PBO",75000,200);
	buku1.tampil();

	Buku buku2=new Buku();
	buku2.setBuku("Inggris",60000,150);
	buku2.tampil();

	Buku buku3=new Buku();
	buku3.setBuku("Geografi",90000,250);
	buku3.tampil();
	}
}