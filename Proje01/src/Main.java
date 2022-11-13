import threads.Kostur;
import threads.Selamla;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
        Set<String> isimler = new HashSet<>();
        isimler.add("can");
        isimler.add("ayse");
        isimler.add("fatme");
        isimler.add("ayse");
        isimler.add("memo");

        isimler.remove("ayse");

        System.out.println("set! " + isimler);
        System.out.println("size! " + isimler.size());

        System.out.println("isEmpty! " + isimler.isEmpty());
        System.out.println("contains! " + isimler.contains("memo"));
        System.out.println("hashCode! " + isimler.hashCode());
        isimler.clear();
        System.out.println("isEmpty! " + isimler.isEmpty());




        Hayvanlar hayvanlar = new Hayvanlar("tekir");

        if (hayvanlar instanceof  Hayvanlar){
            System.out.println(hayvanlar.getHayvanAdi());
        }

        StringBuilder bilgiler = new StringBuilder("can ahmet");

        System.out.println("bilgiler! " + bilgiler);
        bilgiler.append(" can");
        System.out.println("bilgiler! " + bilgiler);
        System.out.println("indexOf! " + bilgiler.indexOf("can"));
        System.out.println("length! " + bilgiler.length());
        System.out.println("lastIndexOf! " + bilgiler.lastIndexOf("can"));
        System.out.println("deleteCharAt! " + bilgiler.deleteCharAt(2));
        System.out.println("deleteCharAt! " + bilgiler.insert(2,"m"));
        System.out.println("deleteCharAt! " + bilgiler.replace(2,5,"memo"));
        System.out.println("isEmpty! " + bilgiler.isEmpty());
        System.out.println("charAt! " + bilgiler.charAt(5));


        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("localDateTime! " + localDateTime);
        System.out.println("localDateTime! " + localDateTime.getMonth());
        System.out.println("getDayOfMonth! " + localDateTime.getDayOfMonth());
        System.out.println("getHour! " + localDateTime.getHour());
        System.out.println("getMinute! " + localDateTime.getMinute());
        System.out.println("getSecond! " + localDateTime.getSecond());

        System.out.println("getYear! " + localDateTime.getYear());

        LocalTime localTime = LocalTime.now();

        System.out.println("localTime! " + localTime);
        System.out.println("localTime! " + localTime);

        Clock clock = Clock.systemDefaultZone();
        System.out.println("clock! " + clock.getZone());
        System.out.println("clock! " + clock.millis());



        Aslan.aslanKukre();
        Aslan aslan = new Aslan();
        aslan.aslanZipla();

        System.out.println("ad! " + Aslan.aslanAdi);
        System.out.println("ad! " + aslan.aslanAdi);



        Hesaplama<String> hesaplama = new Hesaplama<>();
        hesaplama.ekle("memo");
        System.out.println(hesaplama.elemaniAl());

        Hesaplama<Integer> hesaplama1 = new Hesaplama<>();
        hesaplama1.ekle(5);
        System.out.println(hesaplama.elemaniAl());

        Hesaplama<Aslan> hesaplama2 = new Hesaplama<>();
        Aslan aslan = new Aslan();
        hesaplama2.ekle(aslan);
        hesaplama2.elemaniAl().aslanZipla();


         */
        DosyaIslemleri dosyaIslemleri = new DosyaIslemleri();
        /*
        dosyaIslemleri.dosyaOku();
        dosyaIslemleri.dosyayaYazdir();
        dosyaIslemleri.dosyaOku();
        dosyaIslemleri.dosyaOku2();


        dosyaIslemleri.dosyaYazdir();
        dosyaIslemleri.dosyaOku2();


        dosyaIslemleri.dosyaOku3();


        dosyaIslemleri.dosyaYazdir3();
        dosyaIslemleri.dosyaOku3();

         */
        Kostur kostur = new Kostur();
        Thread thread = new Thread(kostur);
        thread.start();

        Selamla selamla = new Selamla();
        selamla.start();

        /*
        * Bir sayi tahmin oyunu yapiyorsunuz, Kullanicinin 3 hakki vardir.
        * Eger kullanici dogru tahmin ederse ekrana "kazandiniz", etmez ise bu sefer
        * eger sayi daha buyuk ise ekrana kucuk girin, ama daha buyuk ise buyuk giriniz yazan ama eger
        * 3 hakkinida bitirdi ise ekrana "kaybettiniz" yazan bir proje yapiniz
        * */
    }
}