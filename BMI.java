/*
 Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)
 */




import java.util.*;


public class BMI {

    public static void main(String[] args)
    {

        double boy;
        double kilo;

        Scanner input=new Scanner(System.in);

        System.out.println("Kullanicinin Boyunu giriniz(ondaliklari \',\'kullanarak ayir):");
        boy = input.nextDouble();
        System.out.println("Kullanicinin Kilosunu giriniz(ondaliklari \',\'kullanarak ayir):");
        kilo = input.nextDouble();

        double bmi = kilo/(boy*boy);

        System.out.println("Kullanicinin boyu="+boy);
        System.out.println("Kullanicinin kilisu="+kilo);
        System.out.println("Vucut Kutle Indeksi="+bmi);



    }

}
