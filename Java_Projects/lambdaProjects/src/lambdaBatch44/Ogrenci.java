package lambdaBatch44;

public class Ogrenci {
    //bir ogrenci listesi olusturun
    //ad soyad yas diplomaNotu cinsiyet
    // toString methodu ile ogrenci bilgilerin yazdirin
    //Öğrenci notlarını alt ve üst limitlere göre sıralayarak  yazdirin
    //Öğrencileri yaşlarına göre sıralayark yazdırin
    //Öğrencileri belirli bir yaşa ve cinsiyete göre sıralayarak listeleyin
    //Öğrencileri isimlerine göre yazdırın
    //Öğrencileri soyisimlerine göre yazdır,n
    //Öğrencileri cinsiyetlerine göre yazdıran
    //listeyi yazdırırken içinde veri var mı diye kontrol edin
    //reduce metoduyla ortalama hesaplayin
    // Girilen ogrenci ismini sil
    //Test amaçlı Öğrenci nesneleri oluşturun.

    private String name;
    private String surName;
    private int age;
    private double diplomaNotu;
    private String cinsiyet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getDiplomaNotu() {
        return diplomaNotu;
    }

    public void setDiplomaNotu(double diplomaNotu) {
        this.diplomaNotu = diplomaNotu;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
    public Ogrenci(String name, String surName, int age, double diplomaNotu, String cinsiyet) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.diplomaNotu = diplomaNotu;
        this.cinsiyet = cinsiyet;


    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", diplomaNotu=" + diplomaNotu +
                ", cinsiyet='" + cinsiyet + '\'' +
                '}';
    }
}
