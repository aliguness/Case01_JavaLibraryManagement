package com.aligunes;

public class KitapTarih extends Kitap{

    private ETur tur = ETur.TARIH;
    public KitapTarih(String ISBN, String kitapAd, String yazarAd, String yazarSoyad) {
        super(ISBN, kitapAd, yazarAd, yazarSoyad);
    }

    public ETur getTur() {
        return tur;
    }

    @Override
    public String toString() {
        return "TarihKitap{" +
                "ISBN='" + ISBN + '\'' +
                "KitapAd= "+kitapAd+'\''+
                ", yazarAd='" + yazarAd + '\'' +
                ", yazarSoyad='" + yazarSoyad + '\'' +
                ", durum=" + durum + ", tur="+tur+
                '}';
    }
}
