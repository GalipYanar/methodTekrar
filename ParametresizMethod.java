package MethodTekrar;

public class ParametresizMethod {

/*
dönüş parametresiz method oluşturmak için VOİD kullanılır. public static void şeklinde oluşturulur ve method un ismi verilir.
method bir kere yazılır ve kodun içerisinde istediğin zaman çağırılıp kullanılır. 1 kez yaz, istediğin kadar kullan.
 */
    public static void main(String[] args) {

        isimYazdirma();
        isimYazdirma();
        telefonYazdirma();

    }

    public static void isimYazdirma(){
/*
eğer ismi 1 kereden fazla yazdırmak istiyorsam main methodunun içerisinde istediğim kadar çağırabilirim.
 */
        System.out.println("selam ben Galip");
    }

    public static void telefonYazdirma(){

        System.out.println("telefon numaram 0553 000 00 00");
    }
}
