package MethodTekrar;

public class DönüşParametreliMethod {

    public static void main(String[] args) {

        ortalama(75,100,65);
/*
burada birkaç sayıyı toplayan ve bize ortalamasını veren bir method yaıyoruz,
ortalama değeri DOUBLE döneceği için, methodumuzu DOUBLE üzerinden oluşturuyoruz.
methodun isimini (ortalama) yazdıktan sonra parametreleri giriyoruz (num1,2,3)
method DOUBLE olduğu için, parametreler ve sonuçta mutlaka Double olmak zorunda.
VOİD den farklı olarak, methodun geri dönüş yapabilmesi için ve SONLANMASI için RETURN anahtar kelimesini kullanıyoruz.
RETURN ün yanına bize hangi değeri dönmesini istediğimizi yazıyoruz.
burada ben double ile ortalamaSonuc diye bir değişken oluşturdum ve methodun bana
RETURN ile ortalamaSonucu dönemsini istedim.
 */

    }

    public static double ortalama (double num1, double num2, double num3){

       double ortalamaSonuc = (num1+num2+num3)/3;
        System.out.println("3 sayının ortalaması : " + ortalamaSonuc);
       return ortalamaSonuc;

    }
}
