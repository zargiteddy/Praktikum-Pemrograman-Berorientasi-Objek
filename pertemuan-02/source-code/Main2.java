class Lingkaran
{
   final double phi = 3.14;
   double jari;
   public void setJari(double jari0)
   {
   this.jari=jari0;
     }
     public double jari()
     {
     return(jari);
     }
     public double luas()
     {
       		double luas0;
       		luas0=phi*jari*jari;
       		return(luas0);
       		}
       		public void tampil()
       		{
     System.out.println("jari jari: "+jari);
System.out.println("luas: "+luas());
}
}

public class Main2
{
public static void main(String[] args)
{
int i;
Lingkaran[] a;
	a=new Lingkaran[5];
		for(i=0;i<5;i++)
{
a[i]=new Lingkaran();
}
	a[0].setJari(00.00);
	a[1].setJari(10.00);
	a[2].setJari(20.00);
	a[3].setJari(30.00);
	a[4].setJari(40.00);
	for(i=0;i<5;i++)
	{
	System.out.println("Lingkaran ke: "+i);
		a[i].tampil();
		}
	}
}