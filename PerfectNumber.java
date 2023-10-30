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
        Hur
    */

    public static void isPerfect(int num) {
        ArrayList<Integer> arr = SumFactors.sumApp(num);
        System.out.println("Bu sayı, mükemmel bir sayı" + ((num == arrTotal(num, arr)) ? "dır!" : " değildir..."));
    }

    public static void perfectThousand() {
        for (int i = 1000; i <= 9999; i++) {
            ArrayList<Integer> multiplierOfNum = SumFactors.sumFactors(i);
            if (i == arrTotal(i, multiplierOfNum)) System.out.println("\n" + i + " mükemmel dört basamanklı sayıdır!");
        }
    }

    public static int arrTotal(int num, ArrayList<Integer> arr) {
        int total = 0;
        for (int nums: arr) total += nums;
        return total;
    }
}
