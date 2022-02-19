package day35_encapsulation_inheritance;

public class Isci extends Muhasebe{
    protected String statu ;
    protected String meslegi ;
    protected  String sendika ;

    public Isci(){
        System.out.println("isci paremetresiz constructor calisti");
    }

    public static void main(String[] args) {
        Isci isci1 = new Isci();
        isci1.meslegi = "kaynakci";
        isci1.saatUcreti = 20; // muhasebe class indan
        isci1.isim = "Emine" ;
        isci1.maas = isci1.maasHesaplama();
        System.out.println(isci1.isim + " 'in maasi : " + isci1.maas);

    }

}
