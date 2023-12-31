import java.util.ArrayList;

public class AmicableNumbers {
    // 6. Soru
    /* 「SORU」
        x ve y pozitif tamsayılar olmak üzere eğer x sayısının kendisi hariç bölenleri toplamı y sayısına ve aynı zamanda y sayısının kendisi hariç bölenleri toplamı
        x sayısına eşit ise bu sayılar arkadaştır denir. Örneğin 220 ve 284 sayıları arkadaş sayılardır. Parametre olarak aldığı iki tamsayının arkadaş olup olmadıklarını
        test eden areFriends metodunu yazınız. Metodunuzu dört basamaklı bir arkadaş sayı çifti bulan bir kodla test edebilirsiniz.
    */
    /* 「AÇIKLAMA」
        * "areFriends" fonksyionu girilen iki integer değerini değerlendirerek arkadaş olup olmadıklarını değerlendirir. SumFactors sınıfındaki sumFactors fonksiyonunu kullanarak
        iki sayı için çarpan arrayleri oluşturulur. Bu arrayler "arrAddition" fonksiyonu ile toplanırlar ve total değişkenleri ile kaydedilirler. Eğer ilk sayı, ikinci sayının çarpnları
        toplamına eşitse VE ikinci sayı, ilk ayının çarpnları toplamına eşitse arkadaş sayı oldukları geri döner.
    */

    public static void areFriends(int num1, int num2) {
        ArrayList<Integer> arr1 =  SumFactors.sumFactors(num1), arr2 =  SumFactors.sumFactors(num2);
        int total1 = arrAddition(arr1), total2 = arrAddition(arr2);
        System.out.println("Bu iki sayı (" + num1 + " ve " + num2 + ") arkadaş sayı" + (num1 == total2 && num2 == total1 ? "lardır!" : " değildir..."));
    }

    public static int arrAddition(ArrayList<Integer> arr) {
        int total = 0;
        for (int num: arr) total += num;
        return total;
    }
}
