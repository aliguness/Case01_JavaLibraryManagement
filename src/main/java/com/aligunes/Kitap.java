package com.aligunes;


public abstract class Kitap {

     String ISBN;
     String kitapAd;
     String yazarAd;
     String yazarSoyad;
     EDurum durum=EDurum.MEVCUT;

     ETur tur;

    public Kitap(String ISBN, String kitapAd, String yazarAd, String yazarSoyad) {
        this.ISBN = ISBN;
        this.kitapAd = kitapAd;
        this.yazarAd = yazarAd;
        this.yazarSoyad = yazarSoyad;
    }

    public EDurum getDurum() {
        return durum;
    }

    public void setDurum(EDurum durum) {
        this.durum = durum;
    }
}
