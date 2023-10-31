import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PasswordChecker {
    // 3. Soru
    /* 「SORU」
        Tabloda herhangi bir programının şifre belirleme arayüzü verilmiştir. Aşağıdaki koşulları yerine şifre oluşturulması sağlayan
        java programını yazınız. ( Not: joptionpane.showinputdialog yapılarını kullanabilirsiniz.)
        * En 8, en fazla 95 hane
        * En az 1 harf, sayı ve özel karakter ( !@#$%^*()~'{}[]|\&_ ) içermeli
        * Boşluk olamaz
    */
    /* 「AÇIKLAMA」

     */

    public static void checkUI() {
        String pass = "", checkIcon = new String(Character.toChars(0x2714)), crossIcon = new String(Character.toChars(0x2716));
        String[] passSplit = {};
        boolean flag = false;
        ArrayList<String> arr = new ArrayList<String>();
        List<String> condArr = Arrays.asList("abcdefghijklmnopqrstuvwxyz", "0123456789", "!@#$%^*()~'{}[]|\\&_");
        List<Integer> condTF = Arrays.asList(0, 0, 0, 0, 0, 0);

        while (!flag) {
            pass = JOptionPane.showInputDialog(null, "Lütfen şifre giriniz:\n" + (condTF.get(0) == 1 ? checkIcon : crossIcon) + " En az 8 karakter karakter olmalıdır\n" + (condTF.get(1) == 1 ? checkIcon : crossIcon) + " 95 karakterden fazla olmamalıdır\n" + (condTF.get(2) == 1 ? checkIcon : crossIcon) + " En az 1 tane harf içermelidir\n" + (condTF.get(3) == 1 ? checkIcon : crossIcon) + " En az 1 tane rakam içermelidir\n" + (condTF.get(4) == 1 ? checkIcon : crossIcon) + " En az 1 tane özel karakter (!@#$%^*()~'{}[]|\\&_) içermelidir\n" + (condTF.get(5) == 1 ? checkIcon : crossIcon) + " Boşluk bulunmamalıdır\n","Şifre Oluşturma Paneli", JOptionPane.INFORMATION_MESSAGE);
            condTF.set(0, 0); condTF.set(1, 0); condTF.set(2, 0); condTF.set(3, 0); condTF.set(4, 0); condTF.set(5, 0);
            passSplit = pass.split("");
            for (String element: passSplit) arr.add(element);

            if (arr.size() >= 8) condTF.set(0, 1);
            if (arr.size() <= 95) condTF.set(1, 1);
            for (int j = 0; j < condArr.size(); j++) if ( condCheck(arr, condArr.get(j).split("")) ) condTF.set(j+2, 1);
            if (!arr.contains(" ")) condTF.set(5, 1);

            if (!condTF.contains(0)) flag = true;
        }
        System.out.println(pass);
    }

    public static boolean condCheck(ArrayList<String> arr,String[] condition) {
        for (int i = 0; i < condition.length; i++) if (arr.contains(condition[i])) return true;
        return false;
    }
}
