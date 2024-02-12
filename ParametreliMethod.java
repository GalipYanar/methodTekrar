package MethodTekrar;

public class ParametreliMethod {

    public static void main(String[] args) {
/*
parametreli methodlarda(burada ki parametreler int num1 ve 2) methodun adını
yazdıktan sonra parantez içerisine mutlaka parametreleri girmemiz gerekir.
burada methodu çağırdıktan sonra num1 e 25, num2 ye 15 değerini atıyoruz
 ve toplamasını istiyoruz.
 */
        sum(25,15);

        bolme(1250,30);

    }

    public static void sum (int num1, int num2)
    {
        int result = num1+num2;
        System.out.println("iki sayının toplamı: " + result);

    }
    public static void bolme (double num3, double num4)
    {
        double sonuc = num3/num4;
        System.out.println("iki sayının ortalaması: " + sonuc);
    }

}
