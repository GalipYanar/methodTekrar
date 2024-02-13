package MethodTekrar;

import java.util.Scanner;

public class DönüşParametreliMethodÖrneği02 {

    //girilen sayıların tek mi çift mi olduğunu ekrana yazdıralım
    // array ve method kullanalım

    public static void main(String[] args) {

        // kullanıcıdan kaç adet sayı kontrolü yapılacağı bilgisini alıyoruz
        System.out.println("kaç adet sayı kontrol edilecek?");
        Scanner scanner = new Scanner(System.in);

        //alt satırda array uzunluğu adında bir değişken oluşturup,
        // bunu oluşturacağımız array in kaç elemanlı olduğunu bulmak için kullanacağız.
        int arrayLength  = scanner.nextInt();


        //burada yeni bir array oluşturuyoruz. array in kaç elemanlı olacağını bir önce ki adımda kullanıcıdan almıştık
        //alınan değeri array kümesinin içerisine koyuyoruz.
        int[] numbers = new int [arrayLength];

        //burada for döngüs ile i yi numbers array in uzunluğu kadar çevirip arttırıyoruz
        for (int i = 0; i < numbers.length; i++){

            // i kullanıcının girdiği değerden küçük olduğu taktirde her seferinde ekrana çıktıyı verip sonraki sayıyı yazmamızı istiyor,
            //çünkü döngü içerisinde kullandık.
            System.out.println("kontrol edilecek " + (i+1) + ". sayıyı giriniz");

            //burada da kullanıcıdan aldığımız sayıları number array inin içerisine atıyoruz.
            numbers[i] = scanner.nextInt();
        }

        // burada foreach döngüsünü kullanarak numbers array inin içerisinde dönerek yazdığımız method u çalıştırıyoruz.
        for (int i : numbers){
            tekCiftKontrol(i);
        }

    }
    // bu yazdığımız method int değerin tek mi çift mi olduğunu kontrol ediyor. bunu yukarıda çağırıp kullanıcının girdiği sayıları kontrol ettireceğiz
    public static void tekCiftKontrol(int num){

        if (num%2==0){
            System.out.println("girdiğiniz sayı: " + num + " çifttir");
        }else {
            System.out.println("girdiğiniz sayı: " + num + " tektir");
        }

    }
}
