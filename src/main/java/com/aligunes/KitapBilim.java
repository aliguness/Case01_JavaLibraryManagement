package com.aligunes;

public class KitapBilim extends Kitap{

    private ETur tur = ETur.BILIM;
    public KitapBilim(String ISBN, String kitapAd, String yazarAd, String yazarSoyad) {
        super(ISBN, kitapAd, yazarAd, yazarSoyad);
    }

    public ETur getTur() {
        return tur;
    }

    @Override
    public String toString() {
        return "BilimKitap{" +
                "ISBN='" + ISBN + '\'' +
                "KitapAd= "+kitapAd+'\''+
                ", yazarAd='" + yazarAd + '\'' +
                ", yazarSoyad='" + yazarSoyad + '\'' +
                ", durum=" + durum + ", tur="+tur+
                '}';

    }
}
