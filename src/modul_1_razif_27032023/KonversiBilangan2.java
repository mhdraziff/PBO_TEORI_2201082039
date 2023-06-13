/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_1_razif_27032023;

/**
 *
 * @author ACER
 */
public class KonversiBilangan2 {
    public static void main(String[] args) {
        String bilanganBiner = "1001001101";

        // Konversi ke desimal
        int bilanganDesimal = Integer.parseInt(bilanganBiner, 2);
        System.out.println("Desimal: " + bilanganDesimal);

        // Konversi ke heksadesimal
        String bilanganHeksadesimal = Integer.toHexString(bilanganDesimal);
        System.out.println("Heksadesimal: " + bilanganHeksadesimal);

        // Konversi ke oktal
        String bilanganOktal = Integer.toOctalString(bilanganDesimal);
        System.out.println("Oktal: " + bilanganOktal);
    }
    
}

/*
Pada baris pertama, kita mendefinisikan metode main sebagai titik masuk untuk eksekusi program.

Di baris kedua, kita mendeklarasikan sebuah variabel bilanganBiner yang berisi string "1001001101". Ini adalah representasi biner dari bilangan yang akan dikonversi.

Pada baris keempat, kita menggunakan metode parseInt dari kelas Integer untuk mengonversi bilanganBiner menjadi bilangan desimal. Argumen kedua, yaitu 2, memberi tahu metode bahwa string input adalah dalam format biner. Hasilnya disimpan dalam variabel bilanganDesimal.

Baris kelima mencetak hasil konversi bilangan biner ke desimal menggunakan System.out.println.

Pada baris ketujuh, kita menggunakan metode toHexString dari kelas Integer untuk mengonversi bilanganDesimal menjadi representasi heksadesimal. Hasilnya disimpan dalam variabel bilanganHeksadesimal.

Baris kedelapan mencetak hasil konversi bilangan biner ke heksadesimal menggunakan System.out.println.

Pada baris kesepuluh, kita menggunakan metode toOctalString dari kelas Integer untuk mengonversi bilanganDesimal menjadi representasi oktal. Hasilnya disimpan dalam variabel bilanganOktal.

Baris kesebelas mencetak hasil konversi bilangan biner ke oktal menggunakan System.out.println.

Jadi, program tersebut mengonversi bilangan biner "1001001101" menjadi bilangan desimal, heksadesimal, dan oktal, dan mencetak hasilnya.

*/
