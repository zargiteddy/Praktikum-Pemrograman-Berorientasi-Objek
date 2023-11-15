//--------------batas awal nomor 1--------------//
abstract class Mahasiswa{
	protected String nama; //nomor 2//
	protected int nilai; //nomor 2//

public abstract void isiBiodata();
public void registrasi(){
	System.out.println("nama "+ nama +" telah melakukan registrasi");
	}
	public void testMasuk(){
	System.out.println("nilai test anda "+ nilai);
	}
}
//--------------batas akhir nomor 1--------------//


//--------------batas awal nomor 3--------------//
class MahasiswaBaru extends Mahasiswa{
	public MahasiswaBaru(String nama, int nilai){
		this.nama = nama;
		this.nilai = nilai;
	}
	public void isiBiodata(){
		System.out.println("nama: "+nama+" ,nilai : "+nilai);
		super.registrasi();
		super.testMasuk();
		}
}
//--------------batas akhir nomor 3--------------//


//--------------batas awal nomor 4--------------//
public class LatihanAbstrak{
	public static void main(String[]args){
		Mahasiswa mb = new MahasiswaBaru("ahmad",80);
		mb.isiBiodata();
	}
}
//--------------batas akhir nomor 4--------------//

