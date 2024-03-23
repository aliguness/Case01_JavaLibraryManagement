package com.aligunes;

import java.util.ArrayList;
import java.util.List;

public class Uye implements IUye{

    private String ad;
    private List<Kitap> oduncAlinanKitaplar;

    public Uye(String ad) {
        this.ad = ad;
        this.oduncAlinanKitaplar=new ArrayList<>();
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public void kitapOduncAl(Kitap kitap) {
        if (kitap.getDurum()==EDurum.MEVCUT){
            kitap.setDurum(EDurum.ODUNC_ALINMIS);
            oduncAlinanKitaplar.add(kitap);
            System.out.println(ad+" adlı üye "+kitap.kitapAd+" adlı kitabı ödünç almıştır.");
        }else {
            System.out.println("Kitap mevcut değil veya başka bir üye tarafından ödünç alınmış. ");
        }
    }

    @Override
    public void kitapIadeEt(Kitap kitap) {
        if (oduncAlinanKitaplar.contains(kitap)){
            kitap.setDurum(EDurum.MEVCUT);
            oduncAlinanKitaplar.remove(kitap);
            System.out.println(ad+" adlı üye "+kitap.kitapAd+" adlı kitabı iade etmiştir.");
        }else {
            System.out.println("Kitap sizin ödünç aldığınız listede bulunmaktadır.");
        }

    }

    @Override
    public void oduncAlinanKitaplariGoruntule() {
        if (oduncAlinanKitaplar.isEmpty()){
            System.out.println("ödünç listeniz boştur.");
        }else {
            System.out.println(ad+" adlı üyenin ödünç aldığı kitaplar:");
            for (Kitap kitap:oduncAlinanKitaplar){
                System.out.println(kitap);
            }
        }

    }
}
