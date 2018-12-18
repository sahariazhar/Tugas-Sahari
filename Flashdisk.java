public class Flashdisk{
   private String warna;
   private String merek;
   private int kapasitaspenyimpanan;
   private int harga;

public Flashdisk(String wrn,String mrk,int kpstspnympn, int hrg){
   this.warna=wrn;
   this.merek=mrk;
   this.kapasitaspenyimpanan=kpstspnympn;
   this.harga=hrg;
}
public void tampilhargaFlashdisk()
{
System.out.println("================HARGA FLASHDISK================");
System.out.println("Warna Flashdisk                 : "+this.warna);
System.out.println("Merek Flashdisk                 : "+this.merek);
System.out.println("Kapasitas Penyimpanan Flashdisk : "+this.kapasitaspenyimpanan+" GB");
System.out.println("Harga Flashdisk                 : Rp "+this.harga);
	}
}

class tampilhargaFlashdisk{
public static void main(String[] args){
Flashdisk fd=new Flashdisk("Putih","TOSHIBA",16,100000);
fd.tampilhargaFlashdisk();
	}
}
