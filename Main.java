public class Main {
    public static void main(String[] args) {
        // 1. Soru
        /* 「SORU」
            Unit Test nedir? Neden Unit Test yaparız? Unit Test Frameworkları listeleyiniz. Unit Test için uyulması gereken kuralları belirtiniz.
        */
        /* 「AÇIKLAMA」
            Unit Testing, kaynak kodundaki kısımların tek tek test edilip kullanmak için uygun olup olmadıklarını belirlemek için yapılan test yöntemidir. Ayırılacak
            kısımları bir fonksiyon, bir sınıf veya bir modül olarak belirleyebiliriz. Bu test işlemi elle veya otomatik olarak, dil için mevcut olan araçlar ve
            frameworkler ile yapılabilir. Sorunların sonrasında çözülmesi zor ve masraflı olmadan hatalar ve kusurlu noktaların tespit edilmesi için kullanılması önemlidir.

            En popüler frameworkleri:
            * JUnit
            * JBehave
            * NUnit
            * XUnit
            * Robot
            * PyUnit
            * Cypress olarak sayabiliriz

            Unit Test için uyulması gereken kurallar:
            * Test edilmesi gereken şeyleri (değişkenler, alanlar, özellikler vb.) hazırlanarak başlanmalı.
            * Beklenilen sonucun alınıp alınmadığını teyit etmek framework çağırılmalı.
            * Tek seferde bir şeyi test edilmelidir. Başka testlerin sonucuna bağlı olunmamalıdır. Parçalar birbirinden bağımsız olmalıdır.
            * En başta en basit, işlevi kafada kolayca kurulabilecek parçalar, testler yapılmalıdır.
            * Ardından beklenmeyen bir durumlar (taşma, veri tipinin bitinin aşılması, veri girilmemesi vb.) için test yapılmalıdır.
            * Değerlerin sınır aralığı arasında farklı değerler denenmelidir.
            * Bir hatanın tespit edilmesi durumunda onu açığa çıkaracak testler hazırlanmalıdır. Böylece hatanın temizlenmesinden sonra kontrol testleri de yapılabilir.
            * Testler açık bir şekilde isimlendirilmelidir, uzun isimlerden kaçınılmamalıdır.
            * Kod yazarken testler tekrar  çalıştırılmaya devam edilmedlidir.
        */

        // 2. Soru
        /* 「SORU」
            Design patern nedir? Kaç tipi vardır her tipe 2 adet örnek veriniz?
        */
        /* 「AÇIKLAMA」
            Tasarım kalıpları, yazılım geliştirmede çıkabilecek genel problemler için olan tekrar kullanılabilir çözümlerdir. Farklı durumlarda, farklı
            sorunlara çözüm olan şabloblar veya ilkelerdir.

            Tasarım kalıpları orijinal olarak 3'e ayrılmıştır, sonrasında 4'e çıkmıştır. Bunları yaratımsal, yapısal, davranışsal ve eşzamanlılık olarak ayırabiliriz.
            -> YARATIMSAL KALIPLAR <-
               Bu kalıplar obje oluşturma mekanizmaları ile ilgilenir.
               * Abstract Factory: Somut sınıflarını belirmeden ilgili veya bağımlı aileler yaratmak için arayüz sunar.
               * Singleton: Bir sınıfın sadece bir örneği olmasını sağlar ve erişmek için bir küresel nokta sağlar.
            -> YAPISAL KALIPLAR <-
               Bu kalıplar varlıklar arasındaki ilişkiyi fark etmenin basit bir yolunu tespit ederek tasarımı kolaylaştıran kalıplardır.
               * Decorator: Dinamik olarak aynı arayüzü tutan objeye ek sorumluluklar atar. Dekoratörler işlevi arttırmak için alt sınıflandırmaya esnek bir alternatif sunar.
               * Facade: Bir alt sistemdeki arayüz setleri için ortak bir arayüz sunar. Cephe, alt sistemi daha kolay kullanılabilir yapan üst seviye bir arayüzü tanımlar.
            -> DAVRANIŞSAL KALIPLAR <-
               Bu kalıplar objeler arasındaki yaygın iletişimi tespit etmeyle ilgilenir.
               * Iterator: Bir küme objenin temel sunumunu açığa çıkarmadan elementlerine ulaşma yolu sunar.
               * Template Method: Alt sınıfa giden bazı adımları erteleyen, bir operasyondaki algoritamanın iskeleteni belirler. Şablon metodu algoritmanın yapısını değiştirmeden
               alt sınıfların algoritmanın bazı adımlarını tekrar tanımlamasını sağlar.
            -> EŞZAMANLILIK KALIPLARI <-
               Bu kalıplar çoklu kullanım paradigmaları ile ilgilenir.
               * Active Object: Kendi kontrol iş parçacığında bulunan metod çağırmasını ve metod çağırmasını ayırır. Amaç istekleri işelemek için eşzamansız metod çağırımı ve zamanlayıcı
               kullanarak, eşzamanlılık oluşturmaktır.
               * CPU Atomic Operation: x86 ve diğer işlemci mimarileri ilkel değerleri (integer) değiştirmek ve erişmek için bellek güvenliğini sağlayan atomik talimatları destekler.
               Örneğin iki iş parçacağının ikisi de bir sayacı güvenle arttırabilir. Bu olanaklar diğer eşzamanlılık kalıplarına mekanizmaları uygulamak için de kullanılabilir.
        */

        //PasswordCreator.passUI(); // 3. Soru
        System.out.println("");
        SerialAddition.serialAddition(); // 4. Soru
        System.out.println("");
        SumFactors.sumApp(24); // 5. Soru
        System.out.println("");
        AmicableNumbers.areFriends(220, 284); // 6. Soru
        System.out.println("");
        PerfectNumber.isPerfect(28); // 7. Soru a
        PerfectNumber.perfectThousand(); // 7. Soru b
    }
}
