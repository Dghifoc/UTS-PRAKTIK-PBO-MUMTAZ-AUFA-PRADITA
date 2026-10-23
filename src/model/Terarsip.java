
package model;

/**
 * Kemampuan untuk koleksi yang memiliki lokasi fisik di rak.
 * Hanya BukuCetak dan Majalah yang menerapkannya.
 */
public interface Terarsip {

    String nomorRak();

    String lokasiLantai();

    default String ringkasanArsip() {
        return "Rak " + nomorRak() + ", " + lokasiLantai();
    }
}
