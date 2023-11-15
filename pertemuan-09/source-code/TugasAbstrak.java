//=====batas awal nomor 1=====//
abstract class Manusia {
    protected String nama;
    protected String jk;
    protected String asal;
    protected String tgl_lahir;

    public Manusia(String nama,String jk,
    			   String asal,String tgl_lahir){
        this.nama = nama;
        this.jk = jk;
        this.asal = asal;
        this.tgl_lahir = tgl_lahir;
    }

public void dataMhs(){
	System.out.println("=====DATA MAHASISWA=====");
	}

public void dataDsn(){
	System.out.println("=====DATA DOSEN=====");
	}

    public String getNama(){
        return nama;
    }
    public String getJk(){
	    return jk;
    }
    public String getAsal(){
		return asal;
	}
    public String getTgl_lahir(){
		return tgl_lahir;
	}
    public abstract void DataDiri();
}

class Mahasiswa extends Manusia{
protected String prodi;
protected int nim;

    public Mahasiswa(String nama,String jk,String asal,
              String tgl_lahir, String prodi, int nim){
    super(nama,jk,asal,tgl_lahir);
    this.prodi = prodi;
    this.nim = nim;
    }

    public String getProdi(){
	    return prodi;
    }
    public int getNim(){
	    return nim;
    }

    @Override
    public void DataDiri() {
		super.dataMhs();
        System.out.println("nama: "+getNama());
        System.out.println("jenis kelamin: "+getJk());
        System.out.println("daerah asal: "+getAsal());
        System.out.println("tanggal lahir: "+getTgl_lahir());
        System.out.println("progam studi: "+getProdi());
        System.out.println("NIM: "+getNim());
        System.out.println("");
    }

}

class Dosen extends Manusia{
	protected String gelar;
protected String matkul;
    public Dosen(String nama,String jk,String asal,
    String tgl_lahir, String gelar, String matkul){
        super(nama,jk,asal,tgl_lahir);
        this.gelar = gelar;
        this.matkul = matkul;
    }
	protected String getGelar(){
	    return gelar;
    }
    protected String getMatkul(){
	    return matkul;
    }

    @Override
    public void DataDiri() {
	super.dataDsn();
    System.out.println("nama: "+getNama());
	System.out.println("jenis kelamin: "+getJk());
	System.out.println("daerah asal: "+getAsal());
	System.out.println("tanggal lahir: "+getTgl_lahir());
	System.out.println("gelar: "+getGelar());
    System.out.println("matkul: "+getMatkul());
    }
}
//=====batas akhir nomor 1=====//

//=====batas awal nomor 2=====//
class TugasAbstrak{
  public static void main(String[] args) {
    Mahasiswa mhs = new Mahasiswa("Joe Frazier","L","Arizona",
    				  "9 Maret 2000","Informatika",195410257);
    Dosen dsn = new Dosen("Etha Sintha","P","Los Angeles",
    		    "3 Januari 1993","Magister Ilmu Komputer","PBO");
    mhs.DataDiri();
    dsn.DataDiri();
    }
}
//=====batas akhir nomor 2=====//