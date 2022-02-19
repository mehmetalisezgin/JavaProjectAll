package lambda1;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda04 {
    public static void main(String[] args) {
        TechPro trGunduz = new TechPro("yaz","TR gunduz",97,124) ;
        TechPro engGunduz = new TechPro("kis","ENG gunduz",95,131) ;
        TechPro trGece = new TechPro("bahar","TR gece",98,143) ;
        TechPro engGece = new TechPro("sonbahar","ENG gece",93,151) ;

        List<TechPro> list=new ArrayList<>(Arrays.asList(trGunduz,engGunduz,trGece,engGece));
        System.out.println(batchOrt92Byk(list));
        System.out.println("**************");
        System.out.println(ogrcSayisi110Az(list));
        System.out.println("**************");
        System.out.println(herhangiBirBaharKontrol(list));
        System.out.println("**************");
        System.out.println(ogrcSayisiTersSiraliBatch(list));
        System.out.println("**************");
        System.out.println(batchOrtTersSiraliBatch(list));
        System.out.println("**************");
        System.out.println(sondan2(list));
        System.out.println("**************");
        System.out.println(batch95DenBuyukOgrenciSayisi(list));
        System.out.println("**************");
        System.out.println(batch95DenBuyukOgrenciSayisi1(list));
        System.out.println("**************");
        System.out.println(ogrcSayisi130BykBatchOrt(list));
    }

// batch ortalamalrinin 92 den buyuk oldugunu kontrol eden program yaziniz

    public static boolean batchOrt92Byk(List<TechPro>list){
        // hepsine bakacagimiz icin allmatc
    return   list.
               stream().
               allMatch(TechPro -> TechPro.getBatchOrt()>92);



    }
// task2--->> ogr sayilarinin 110 dan az olmadigi kontrol eden pr yaziniz

public static boolean ogrcSayisi110Az(List<TechPro>list){

      return list.stream().allMatch(TechPro->TechPro.getOgrcSayisi()>110)  ;

}

//task3 task 03-->batch'lerde herhangi birinde "bahar" olup olmadigini  kontrol eden pr create ediniz.

public static boolean herhangiBirBaharKontrol(List<TechPro>list){

   return list.stream().allMatch(TechPro-> Boolean.parseBoolean(TechPro.getBatchName()))  ;
}
//task 04-->batch'leri ogr sayilarina gore b->k siralayiniz.

    public static List<TechPro> ogrcSayisiTersSiraliBatch(List<TechPro>list){

      return list.
              stream().
              sorted(Comparator.comparing(TechPro::getOgrcSayisi).
                      reversed()).
              collect(Collectors.toList());
    }
//task5 batch leri batch ort gore sirala buyukten kucuge siralayip ilk 3 unu yazdirin
public static List<TechPro> batchOrtTersSiraliBatch(List<TechPro> list){
    return  list.
            stream().
            sorted(Comparator.comparing(TechPro::getBatchOrt).reversed()).//ogrcSayisi parametresine gore ters siraladi
                    limit(3).//akıstadki elemanlarin ilk ucu alindi
                    collect(Collectors.toList());//collect()->akısdaki elamanları istenen sarta gore toplar
    //Collectors.toList()->collect'e toplanan elemanlarilist'e cevirir
}
//task 06--> ogrc sayisi en az olan 2. batch'i  yazdiriniz.

    public static List<TechPro> sondan2(List<TechPro>list) {
        return list.stream().sorted(Comparator.
                comparing(TechPro::getOgrcSayisi)).limit(2).skip(1).collect(Collectors.toList());
    }

// task 07==> batch ortalamalri 95 den buyuk olan batchlerin ogr sayilarini tamamini yazdiriniz


    public static int batch95DenBuyukOgrenciSayisi(List<TechPro>list){
     return   list.
             stream().
             filter(t->t.
                     getBatchOrt()>95).
             map(t->t.getOgrcSayisi()).
             reduce(0,Integer::sum);
    }
    public static int batch95DenBuyukOgrenciSayisi1(List<TechPro>list){
        return   list.
                stream().
                filter(t->t.
                        getBatchOrt()>95).
                mapToInt(t->t.getOgrcSayisi()).
                sum();
    }

    public static OptionalDouble ogrcSayisi130BykBatchOrt(List<TechPro>list){
      return  list.
              stream().
              filter(t->t.
                      getOgrcSayisi()>130).
              mapToDouble(t->t.getBatchOrt()).
              average() ;
    }
//task 09-->gunduz batch'lerinin sayisini  yazdiriniz.
public static int gunduzBatch(List<TechPro>list){
    return (int)    list.stream().filter(t->t.getBatchName().contains("gunduz")).count();
}
//task 10-->Ogrenci sayilari 130'dan fazla olan batch'lerin en buyuk batch ort'unu bulunuz
public static OptionalInt ogrcSayisi130FazlaEnBykBatch(List<TechPro> list){
    return list.
            stream()
            .filter(t->t.getOgrcSayisi()>130).
            mapToInt(TechPro::getBatchOrt).
            max();

}
//task 11-->Ogrenci sayilari 150'dan az olan batch'lerin en kucuk batch ort'unu bulunuz.
public static OptionalInt ogrcSayisi150AzEnKckBatch(List<TechPro> list){
    return list.
            stream()
            .filter(t->t.getOgrcSayisi()>130).
            mapToInt(TechPro::getBatchOrt).
            max();


}
}
