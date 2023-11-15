class Buku
   {
   String judul;
   int harga;
   int halaman;
   String penerbit;
   String penulis;
public void setBuku(String judul,int harga,int halaman, String penerbit,String penulis)
{
this.judul=judul;
   this.harga=harga;
      this.halaman=halaman;
         this.penerbit=penerbit;
            this.penulis=penulis;}
                public void tampil(){
		        System.out.println("Judul buku :"+judul);
	         System.out.println("Harga buku : "+harga);
          System.out.println("Jumlah halaman : "+halaman);
     System.out.println("Penerbit buku : "+penerbit);
System.out.println("Penulis buku : "+penulis);
}}
public class ObyekBuku2{
	public static void main(String[] args){
	Buku buku1=new Buku();
	buku1.setBuku("PBO",75000,200,"Erlangga","Luke Shaw");
	buku1.tampil();
System.out.println("===============================");
	Buku buku2=new Buku();
	buku2.setBuku("Inggris",60000,150,"Grasindo","Elizabeth Lail");
	buku2.tampil();
System.out.println("===============================");
	Buku buku3=new Buku();
	buku3.setBuku("Geografi",90000,250,"Mizan","Bruno Fernandes");
	buku3.tampil();
	}
}