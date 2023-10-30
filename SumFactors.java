import java.util.ArrayList;

public class SumFactors {
    // 5. Soru
    /* 「SORU」
        Parametresi ile aldığı pozitif bir tamsayının kendisi hariç tüm çarpanlarının toplamı ile geri dönen sumFactors metodunu yazınız.
        Metot parametresi ile aldığı sayı hariç tüm çarpanlarının toplamına geri dönecektir: (1 her sayının doğal çarpanıdır ve toplama dahil edilecektir.)
    */
    /* 「AÇIKLAMA」
        * "sumFactors" fonksiyonun işlevi gelen sayıyı çarpanlarına ayırmaktır. Fonksiyon başında sayının çarpanlarının bulunabilmesi için 1'den başlayarak hedef sayıya kadar sayı üretilir.
        Sonrasında şartların sağlanmasının ardından for döngüsüne girilir ve içinde sayının, çarpan listesindeki güncel sayıyla modunun 0 olması ve sayının kendisine eşit çarpan olmaması
        durumunda çarpan "multipliersOfNum" arrayine eklenir.
        * "sumApp" fonksiyonu "sumFactors" fonkunu kullanarak sayıyı ve çarpanlarını terminalde gösterir.
    */

    public static ArrayList<Integer> sumFactors(int num) {
        int[] sumNmrs = new int[num];
        for (int i = 1; i < sumNmrs.length + 1; i++) sumNmrs[i - 1] = i;
        ArrayList<Integer> multipliersOfNum = new ArrayList<Integer>();
        if (num > 0) {
            for (int j = 0; j < sumNmrs.length; j++) {
                if (num % sumNmrs[j] == 0 && sumNmrs[j] != num) multipliersOfNum.add(sumNmrs[j]);
            }
        }
        return multipliersOfNum;
    }

    public static ArrayList<Integer> sumApp(int num) {
        String factoredText = "Sayı " + num + "\n";
        ArrayList<Integer> arr = sumFactors(num);
        for (int i: arr) factoredText += i + " ";
        System.out.println(factoredText);
        return arr;
    }
}
