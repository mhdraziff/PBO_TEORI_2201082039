/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_1_razif_27032023;

/**
 *
 * @author ACER
 */
public class KonversiBilangan1 {
    public static void main(String[] args) {
        int bilanganDesimal = 1980;

        // Konversi ke biner
        String bilanganBiner = Integer.toBinaryString(bilanganDesimal);
        System.out.println("Biner: " + bilanganBiner);

        // Konversi ke heksadesimal
        String bilanganHeksadesimal = Integer.toHexString(bilanganDesimal);
        System.out.println("Heksadesimal: " + bilanganHeksadesimal);

        // Konversi ke oktal
        String bilanganOktal = Integer.toOctalString(bilanganDesimal);
        System.out.println("Oktal: " + bilanganOktal);
    }
}
/*
 * Baris Ke-1
 * --> Mendeklarasikan fungsi utama main yang merupakan titik masuk untuk menjalankan program Java.
 * Baris Ke-2
 * --> Mendeklarasikan variabel bilanganDesimal dengan nilai 1980. Ini adalah bilangan desimal yang akan dikonversi.
 * Baris Ke-3
 * --> Menggunakan metode Integer.toBinaryString() untuk mengonversi bilanganDesimal menjadi bentuk biner. Metode ini mengambil bilangan desimal sebagai argumen dan mengembalikan representasinya dalam bentuk string biner.
 * Baris Ke-5
 * --> Mencetak hasil konversi ke bentuk biner menggunakan System.out.println(). Pesan "Biner: " diikuti oleh nilai bilanganBiner yang telah dikonversi.
 * Baris Ke-8
 * -->enggunakan metode Integer.toHexString() untuk mengonversi bilanganDesimal menjadi bentuk heksadesimal. Metode ini mengambil bilangan desimal sebagai argumen dan mengembalikan representasinya dalam bentuk string heksadesimal.
 * Baris Ke-9
 * --> Mencetak hasil konversi ke bentuk heksadesimal menggunakan System.out.println(). Pesan "Heksadesimal: " diikuti oleh nilai bilanganHeksadesimal yang telah dikonversi.
 * Baris Ke-12
 * --> Menggunakan metode Integer.toOctalString() untuk mengonversi bilanganDesimal menjadi bentuk oktal. Metode ini mengambil bilangan desimal sebagai argumen dan mengembalikan representasinya dalam bentuk string oktal.
 * Baris Ke-13
 * --> Mencetak hasil konversi ke bentuk oktal menggunakan System.out.println(). Pesan "Oktal: " diikuti oleh nilai bilanganOktal yang telah dikonversi.
 */
