interface Interface1 {
  public void tampilInfo();
  public void setInfo(String info);
    }
    interface Interface2 {
    public void cetakInfo();
}

class MultiInterfaces implements Interface1, Interface2 {
    private String info;
    public void setInfo(String info) {
    this.info = info;
    }
    public void tampilInfo(){
System.out.println(this.info+": ini info dari method tampilInfo");
}

public void cetakInfo(){
System.out.println(this.info+": ini info dari method cetakInfo");
}
}

public class MultipleInterface{
    public static void main(String[] a) {
    MultiInterfaces t = new MultiInterfaces();
    t.setInfo("Hai");
    t.tampilInfo();
    }
}



