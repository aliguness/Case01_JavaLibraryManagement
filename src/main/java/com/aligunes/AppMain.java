package com.aligunes;

public class AppMain {
    public static void main(String[] args) {

        KitapBilim kitapBilim = new KitapBilim("2323424442","Fareler ve İnsanlar","John","Steinbeck");

        KitapRoman kitapRoman = new KitapRoman("3242342352","Akşam Güneşi","Ferdi","Bey");

        Uye uye1 = new Uye("Abraham");

        uye1.kitapOduncAl(kitapBilim);
        uye1.kitapOduncAl(kitapRoman);

        uye1.oduncAlinanKitaplariGoruntule();

        uye1.kitapIadeEt(kitapRoman);

        uye1.oduncAlinanKitaplariGoruntule();

        Kutuphane kutuphane1 = new Kutuphane();

        kutuphane1.kitapEkle(kitapBilim);
        kutuphane1.kitapEkle(kitapRoman);

        kutuphane1.uyeEkle(uye1);

        kutuphane1.kitaplarGoruntule();

        kutuphane1.uyeleriGoruntule();

    }
}