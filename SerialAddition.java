public class SerialAddition {
    // 4. Soru
    /* 「SORU」
        e sayısını aşağıdaki seri toplamıyla bulabilirsiniz:
        Bir Java programı yazarak e sayısını yukarıdaki seri toplamıyla hesaplayarak ekrana yazdırınız.
    */
    /* 「AÇIKLAMA」
        Örnekte bulmak istediğimiz e sayısını en başta "Math.exp(1)" ile kaydederiz. Bununla beraber taban sayısını, sonda gösterilecek taban faktöriyelini ve toplamı saklayacak
        değişkenleri ayarlarız. Yapacağımız işlemde ilk 2 toplama 2'ye eşit olacağı için işlem kolaylığı için "total" değişkeni en başta 2 olarak ayarlanmıştır.
        Ardından for döngüsü içinde total'a 1 bölü şuan döndürülen faktöriyelin sonucu işlemi yapılır. Sonrasında taban sayısı döngünün j değeri ile çarpılır ve görsel faktöriyel değeri
        1 arttırılır.
        Sonuç String olarak döndürülür.
    */

    public static void serialAddition() {
        int denominator = 1, factorial = 2;
        double total = 2.0, e = Math.exp(1);
        for (int j = 2; total < e; j++) {
            total += 1 / (double)(denominator * j);
            denominator *= j;
            factorial ++;
        }
        System.out.println("e sayısına (" + e + ") en yakın sayımızı bulduk! Değerimiz \"" + total + "\".\nİşlem tamamlandığında tabandaki faktöriyel " + factorial + " idi.");
    }
}
