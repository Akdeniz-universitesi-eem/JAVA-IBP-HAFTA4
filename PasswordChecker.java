import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

    public static void checkNew() {
        String pass = "", checkIcon = new String(Character.toChars(0x2714)), crossIcon = new String(Character.toChars(0x2716));
        ArrayList<String> arr = new ArrayList<>();
        List<String> condArr = Arrays.asList("abcdefghijklmnopqrstuvwxyz", "0123456789", "!@#$%^*()~'{}[]|\\&_");
        List<Integer> condTF = Arrays.asList(0, 0, 0, 0, 0, 0);
        int [] condStatus = {0, 0, 0, 0 ,0 ,0};
        String[] passSplit = {};
        boolean flag = false;

        while (!flag){
            arr.clear();
            pass = JOptionPane.showInputDialog(null, "Lütfen şifre giriniz:\n" + (condStatus[0] == 1 ? checkIcon : crossIcon) + " En az 8 karakter karakter olmalıdır\n" + (condStatus[1] == 1 ? checkIcon : crossIcon) + " 95 karakterden fazla olmamalıdır\n" + (condStatus[2] == 1 ? checkIcon : crossIcon) + " En az 1 tane harf içermelidir\n" + (condStatus[3] == 1 ? checkIcon : crossIcon) + " En az 1 tane rakam içermelidir\n" + (condStatus[4] == 1 ? checkIcon : crossIcon) + " En az 1 tane özel karakter (!@#$%^*()~'{}[]|\\&_) içermelidir\n" + (condStatus[5] == 1 ? checkIcon : crossIcon) + " Boşluk bulunmamalıdır\n","Şifre Oluşturma Paneli", JOptionPane.INFORMATION_MESSAGE);
            passSplit = pass.split("");
            Collections.addAll(arr, passSplit);

            condStatus[0] = arr.size() >= 8 ? 1 : 0;
            condStatus[1] = arr.size() <= 95 ? 1 : 0;
            for (int j = 0; j < condArr.size(); j++) condStatus[j + 2] = condCheck(arr, condArr.get(j).split("")) ? 1 : 0;
            condStatus[5] = !arr.contains(" ") ? 1 : 0;

            for(int i = 0; i < condStatus.length; i++) condTF.set(i, condStatus[i]);
            if (!condTF.contains(0)) flag = true;
        }
        System.out.println(pass);
        JOptionPane.showMessageDialog(null, "Şifre oluşturuldu:\n" + pass + "\n" + (condStatus[0] == 1 ? checkIcon : crossIcon) + " En az 8 karakter karakter olmalıdır\n" + (condStatus[1] == 1 ? checkIcon : crossIcon) + " 95 karakterden fazla olmamalıdır\n" + (condStatus[2] == 1 ? checkIcon : crossIcon) + " En az 1 tane harf içermelidir\n" + (condStatus[3] == 1 ? checkIcon : crossIcon) + " En az 1 tane rakam içermelidir\n" + (condStatus[4] == 1 ? checkIcon : crossIcon) + " En az 1 tane özel karakter (!@#$%^*()~'{}[]|\\&_) içermelidir\n" + (condStatus[5] == 1 ? checkIcon : crossIcon) + " Boşluk bulunmamalıdır\n", "Şifre Oluşturma Paneli", JOptionPane.INFORMATION_MESSAGE);}

    public static boolean condCheck(ArrayList<String> arr,String[] condition) {
        for (String k: condition) if (arr.contains(k)) return true;
        return false;
    }
}
