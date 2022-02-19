package day35_encapsulation_inheritance;

public class Muhasebe extends Personel{

    protected int saatUcreti;
    protected int maas ;
    protected String statu;

    public Muhasebe(){
        System.out.println("Muhasebe parametresiz constructor calisti");
    }

    public static void main(String[] args) {
        Muhasebe clsn1 = new Muhasebe();
        clsn1.isim = "Ali";

    }
    public int maasHesaplama(){
        int maas = 8*25*saatUcreti ;
        return maas ;
    }
}
