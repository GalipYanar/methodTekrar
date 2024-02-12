package MethodTekrar;

public class DönüşParametreliMethÖrneği {
    /*
    bir kuruyemişçi toptancıdan ürünalıp, aşağıda verilen kar oranları ile hepsini satmıştır.
    satılan ürünler ile dükkan kirasını ödeyebilir mi? method kullanarak yazınız.

    alınan ürün:
    12 kg leblebi, kg birim 3,5TL ++
    40 kg badem, kg birim 22TL ++
    25 kg fındık, kg birim 15,7TL ++

    kar oranı:
    leblebi %50 kar
    fındık %40 kar
    badem %60 kar
    dükkan kirası = 2000TL
    kazanılan para ile dükkan kirası ödenebilirse yada ödenemezse ekrana yazdır
     */
    public static void main(String[] args) {

        int kira = 2000;
        double ciro = 0;

        alinanLeblebi(12,3.5);

        alinanBadem(40,22);

        alinanFindik(25,15.7);


        ciro = satilanBadem(40, 22, 0.6)+satilanLeblebi(12,3.5,0.5)+satilanFindik(25,15.7,0.4);

        if (ciro > kira){
            System.out.println("Toplam cironuz : " + ciro);
            System.out.println("Tebrikler, kirayı çıkarttın. Şimdi sırada ekmek parası...");

        }else {
            System.out.println("Toplam cironuz : " + ciro);
            System.out.println("Geçmiş olsun, kirayı çıkaramadın...");
        }




    }
    public static double alinanLeblebi(double leblebiKg, double leblebiMaliyet ){

        double toplamLeblebiMaliyeti = leblebiKg * leblebiMaliyet;
        System.out.println("toplam 12kg leblebinin dükkana maliyeti : " + toplamLeblebiMaliyeti);
        return toplamLeblebiMaliyeti;
    }
    public static double satilanLeblebi(double alinanLeblebi, double leblebiAlisFiyatı  , double leblebiSatisKarı ){

        double leblebiSatisTutarı = leblebiAlisFiyatı*leblebiSatisKarı+leblebiAlisFiyatı;
        double toplamSatılanLeblebi = leblebiSatisTutarı * alinanLeblebi;
        System.out.println("toplam satılan satılan leblebi : " + toplamSatılanLeblebi + " TL");
        return toplamSatılanLeblebi;
    }
    public static double alinanFindik(double findikKg, double findikMaliyet ){

        double toplamFindikMaliyeti = findikKg * findikMaliyet;
        System.out.println("toplam 25kg fındığın dükkana maliyeti : " + toplamFindikMaliyeti);
        System.out.println("----------");
        return toplamFindikMaliyeti;
    }
    public static double satilanFindik(double alinanFindik, double findikAlisFiyatı  , double FindikSatisKarı ){

        double findikSatisTutarı = findikAlisFiyatı * FindikSatisKarı + findikAlisFiyatı;
        double toplamSatılanFindik = findikSatisTutarı * alinanFindik;
        System.out.println("toplam satılan fındık : " + toplamSatılanFindik + " TL");
        System.out.println("----------");
        return toplamSatılanFindik;
    }
    public static double alinanBadem(double bademKg, double bademMaliyet ){

        double toplamBademMaliyeti = bademKg * bademMaliyet;
        System.out.println("toplam 40kg bademin dükkana maliyeti : " + toplamBademMaliyeti);
        return toplamBademMaliyeti;
    }
    public static double satilanBadem(double alinanBadem, double bademAlisFiyatı  , double bademSatisKarı ){

        double bademSatisTutarı = bademAlisFiyatı*bademSatisKarı+bademAlisFiyatı;
        double toplamSatılanBadem = bademSatisTutarı * alinanBadem;
        System.out.println("toplam satılan badem : " + toplamSatılanBadem + " TL");
        return toplamSatılanBadem;
    }
}
