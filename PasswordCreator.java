import javax.swing.*;
import java.util.ArrayList;
public class PasswordCreator {
    // 3. Soru
    /* 「SORU」
        Tabloda herhangi bir programının şifre belirleme arayüzü verilmiştir. Aşağıdaki koşulları yerine şifre oluşturulması sağlayan
        java programını yazınız. ( Not: joptionpane.showinputdialog yapılarını kullanabilirsiniz.)
        * En 8, en fazla 95 hane
        * En az 1 harf, sayı ve özel karakter ( !@#$%^*()~'{}[]|\&_ ) içermeli
        * Boşluk olamaz
    */
    /* 「AÇIKLAMA」
        * Şifre oluşturma işlemimiz "passCreatoe" fonksiyonu ile başlar. Uzunluk şartını sağlaması için rastgele 8 ile 95 arasında bir şifre uzunluğu belirlebir.
        * Ardından while döngüsü ile şifre oluşturma işlemi başlar. Şifre çıktısı bir sorun çıkmaması için her döngü başında sıfırlanır. Şifreye ne tip bir
        karakter (harfler için 1, sayılar için 2, özel karakterler için 3) girdiğimizi kaydetmek için şifre uzunluğunda bir array oluşturulur.
        * While içindeki for döngüsüne girilir ve karakter tipini belirlemek için 1-2-3 arasından rastgele bir sayı seçilir (Görsel amaçlarla ilk karakter özel karakter olmayacak şekilde
        ayarlanmıştır.) Tip seçildikten sonra tipi belirten sayı "checkArr"a eklenir ve "returnChar" fonksiyonuna tip ve geri almak istediğimiz String gönderilir.
        * "returnChar" fonksiyonun başında karakter çeşitlerimiz vardır ve fonksiyonu çağırırken seçimimize göre kondisyon karakterlerini ayırırız ve şifre çıktısına ekleriz.
        * Eğer checkArr tüm karakter çeşitlerini içeriyorsa (şartlarımızdan biri buydu) şifre çıkan pencrede yazılır. Şart sağlanmıyorsa sorun oluştuğu terminale yazılır ve şartları sağlayan
        şifre oluşturulana kadar döngü devam eder.
    */

    public static void passUI() {
        String userPass = passCreator();
        String checkIcon = new String(Character.toChars(0x2705));
        System.out.println(userPass);
        JOptionPane.showMessageDialog(null,  userPass+ "\n\nŞifre:\n" + checkIcon + " En az 8 karakter, en fazla 24 karakter olmalıdır\n" + checkIcon + " En az 1 tane harf, rakam ve özel karakter (!@#$%^*()~'{}[]|\\&_) içermelidir\n" + checkIcon + " Boşluk bulunmamalıdır\n");
    }

    public static String passCreator() {
        int passwordLength = randomNum(8, 95);
        String passwordOutput = "";
        boolean flag = false;
        while (!flag) {
            passwordOutput = "";
            ArrayList<Integer> checkArr = new ArrayList<Integer>(passwordLength);
            for (int i = 0; i < passwordLength; i++) {
                int selection =  randomNum(1, i == 0 ? 2 : 3);
                checkArr.add(selection);
                passwordOutput = returnChar(selection, passwordOutput);
            }
            if (checkArr.contains(1) && checkArr.contains(2) && checkArr.contains(3)) flag = true;
            else System.out.println("Attempt failed... Creating new password.");
        }
        return passwordOutput;
    }

    public static String returnChar(int selection, String text) {
        String[] condChars = {"abcdefghijklmnopqrstuvwxyz", "0123456789", "!@#$%^*()~'{}[]|\\&_", "ABCDEFGHIKJLMNOPRSTUVWXYZ"};
        char[] temp = condChars[selection - 1].toCharArray();

        switch (selection) {
            case 1 -> text += temp[randomNum(0, 25)];
            case 2 -> text += temp[randomNum(0, 9)];
            case 3 -> text += temp[randomNum(0, 18)];
        }
        return text;
    }

    public static int randomNum(int min, int max) {
        int randomNum = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return randomNum;
    }
}
