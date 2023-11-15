class PersegiPanjang
{
	protected int panjang;
	protected int lebar;

	public void setPanjang(int panjang)
	{
		this.panjang = panjang;
	}

	public int getPanjang()
	{
		return panjang;
	}

	public void setLebar(int lebar)
	{
		this.lebar = lebar;
	}

	public int getLebar()
	{
		return lebar;
	}

	public int getHitungLuas()
	{
		return getPanjang() * getLebar();
	}

	public void TampilkanLuas()
	{
		System.out.println("Luas Persegi Panjang : "
		+getHitungLuas());
	}
}

class Balok extends PersegiPanjang
{
	private int tinggi;

	public void setTinggi(int tinggi)
	{
		this.tinggi = tinggi;
	}

	public int getTinggi()
	{
		return tinggi;
	}

	public int getHitungVolume()
	{
		return getPanjang() * getLebar() * getTinggi();
	}

	public void TampilkanData()
	{
		System.out.println("Volume Balok : "
		+getHitungVolume());
	}

}

public class Inheritance
{
	public static void main(String[] args)
	{

System.out.println("-----PERSEGI PANJANG-----");

	PersegiPanjang pp = new PersegiPanjang();
	pp.setPanjang(18);
	pp.setLebar(9);

	System.out.println("Panjang : " + pp.getPanjang());
	System.out.println("Lebar : " + pp.getLebar());

	pp.TampilkanLuas();

System.out.println("");

System.out.println("----------BALOK----------");

	Balok b = new Balok();
	b.setPanjang(25);
	b.setLebar(10);
	b.setTinggi(15);

	System.out.println("Panjang : " + b.getPanjang());
	System.out.println("Lebar : " + b.getLebar());
	System.out.println("Tinggi : " + b.getTinggi());

	b.TampilkanData();
	}
}
