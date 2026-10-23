
package layanan;

import java.util.Comparator;
import model.Koleksi;

/** Koleksi layak pinjam tampil lebih dulu, lalu diurutkan menurut judul (A-Z). */
public class UrutLayakLaluJudul implements Comparator<Koleksi> {

    @Override
    public int compare(Koleksi a, Koleksi b) {
        int hasil = Boolean.compare(b.layakDipinjam(), a.layakDipinjam());
        if (hasil != 0) {
            return hasil;
        }
        return a.getJudul().compareToIgnoreCase(b.getJudul());
    }
}
