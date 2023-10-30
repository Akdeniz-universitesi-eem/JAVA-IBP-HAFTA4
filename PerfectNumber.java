import java.util.ArrayList;

public class PerfectNumber {
    // 7. Soru
    /* 「SORU」
        Kendisi haricindeki tüm pozitif bölenlerinin toplamına eşit olan tamsayılara "mükemmel sayı" (perfect number) denir. Örneğin 6 ve 28 sayıları mükemmel sayılardır:
            6 = 1 + 2 + 3
            28 = 1 + 2 + 4 + 7 + 14
        a) Parametresi ile aldığı int türden bir değerin mükemmel sayı olup olmadığını test eden isPerfect metodunu yazınız. Metot sayı mükemmel ise true mükemmel değil ise
        false değerine geri dönecektir.
        b) 4 basamaklı tek bir mükemmel sayı vardır. Yazmış olduğunuz isPerfect metodunu kullanarak 4 basamaklı mükemmel sayıyı bulan programı yazınız.
    */
    /* 「AÇIKLAMA」
        *"isPerfect" fonksiyonu kontrol edilmek sayıyı alır ve SumFactors sınıfındaki sumFactors fonksiyonunu kullanarak çarpanlarına ayırır ve arr arrayine kaydeder.
        Eğer AmicableNumbers sınıfındaki arrAddition fonksiyonu ile toplanan çarpanlar, çarpanı oldukları sayıya eşitse mükemmel olduğu, eşit değilse mükemmel olmadığı
        döndürülür.
        * "perfectThousand" fonksiyonunun işlevi tek mükemmel dört basamanklı sayıyı bulmaktır. for döngüsü ile 1000'den başlanarak tüm dört basamaklı sayılar
        değerlendirilir. SumFactors sınıfındaki sumFactors fonksiyonu kullanarak çarpanlara ayırma yapılır ve AmicableNumbers sınıfındaki arrAddition fonksiyonu ile toplanan
        çarpanlar, dönen sayıya eşitse sayı yazılır.
    */

    public static void isPerfect(int num) {
        ArrayList<Integer> arr = SumFactors.sumApp(num);
        System.out.println("Bu sayı, mükemmel bir sayı" + ((num == AmicableNumbers.arrAddition(arr)) ? "dır!" : " değildir..."));
    }

    public static void perfectThousand() {
        for (int i = 1000; i <= 9999; i++) {
            ArrayList<Integer> arr = SumFactors.sumFactors(i);
            if (i == AmicableNumbers.arrAddition(arr)) System.out.println("\n" + i + " tek mükemmel dört basamanklı sayıdır!");
        }
    }
}
