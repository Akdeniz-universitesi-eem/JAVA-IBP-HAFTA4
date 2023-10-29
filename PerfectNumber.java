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
        String factoredText = "Sayı " + num + "\n";
        ArrayList<Integer> multiplierOfNum = perfectChecker(num);
        for (int i: multiplierOfNum) {
            factoredText += i + " ";
        }
        System.out.println(factoredText);
        System.out.println("Bu sayı, mükemmel bir sayı" + ((num == arrTotal(num, multiplierOfNum)) ? "dır!" : " değildir..."));
    }

    public static void perfectThousand() {
        for (int i = 1000; i <= 9999; i++) {
            ArrayList<Integer> multiplierOfNum = perfectChecker(i);
            if (i == arrTotal(i, multiplierOfNum)) System.out.println("\n" + i + " mükemmel dört basamanklı sayıdır!");
        }
    }

    public static ArrayList<Integer> perfectChecker(int num) {
        int[] primeNmrs = new int[num];
        multiplierArrGen(primeNmrs);
        ArrayList<Integer> multiplierOfNum = new ArrayList<Integer>();
        if (num > 0) {
            for (int j = 0; j < primeNmrs.length; j++) {
                if (num % primeNmrs[j] == 0 && primeNmrs[j] != num) multiplierOfNum.add(primeNmrs[j]);
            }
        }
        return multiplierOfNum;
    }

    public static int arrTotal(int num, ArrayList<Integer> arr) {
        int total = 0;
        for (int nums: arr) total += nums;
        return total;
    }

    public static int[] multiplierArrGen(int[] arr) {
        for (int i = 1; i < arr.length + 1; i++) arr[i - 1] = i;
        return arr;
    }
}
