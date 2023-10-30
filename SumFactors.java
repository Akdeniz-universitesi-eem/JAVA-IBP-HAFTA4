import java.util.ArrayList;

public class SumFactors {
    // 5. Soru
    /* 「SORU」
        Parametresi ile aldığı pozitif bir tamsayının kendisi hariç tüm çarpanlarının toplamı ile geri dönen sumFactors metodunu yazınız.
        Metot parametresi ile aldığı sayı hariç tüm çarpanlarının toplamına geri dönecektir: (1 her sayının doğal çarpanıdır ve toplama dahil edilecektir.)
    */
    /* 「AÇIKLAMA」
        Hur
    */

    public static ArrayList<Integer> sumFactors(int num) {
        int[] primeNmrs = new int[num];
        sumMultipliers(primeNmrs);
        ArrayList<Integer> multiplierOfNum = new ArrayList<Integer>();
        if (num > 0) {
            for (int j = 0; j < primeNmrs.length; j++) {
                if (num % primeNmrs[j] == 0 && primeNmrs[j] != num) multiplierOfNum.add(primeNmrs[j]);
            }
        }
        return multiplierOfNum;
    }

    public static int[] sumMultipliers(int[] arr) {
        for (int i = 1; i < arr.length + 1; i++) arr[i - 1] = i;
        return arr;
    }

    public static ArrayList<Integer> sumApp(int num) {
        String factoredText = "Sayı " + num + "\n";
        ArrayList<Integer> arr = sumFactors(num);
        for (int i: arr) {
            factoredText += i + " ";
        }
        System.out.println(factoredText);
        return arr;
    }
}
