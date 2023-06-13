/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_1_razif_27032023;

/**
 *
 * @author ACER
 */
public class KonversiBilangan4 {
     public static void main(String[] args) {
        String bilanganHeksadesimal = "47F";

        // Konversi ke desimal
        int bilanganDesimal = Integer.parseInt(bilanganHeksadesimal, 16);
        System.out.println("Desimal: " + bilanganDesimal);

        // Konversi ke biner
        String bilanganBiner = Integer.toBinaryString(bilanganDesimal);
        System.out.println("Biner: " + bilanganBiner);

        // Konversi ke oktal
        String bilanganOktal = Integer.toOctalString(bilanganDesimal);
        System.out.println("Oktal: " + bilanganOktal);
    }

}

/*
Pertama, kita memiliki variabel bilanganHeksadesimal yang berisi string "47F", yang merupakan bilangan heksadesimal.

Selanjutnya, kita menggunakan metode Integer.parseInt(bilanganHeksadesimal, 16) untuk mengkonversi bilangan heksadesimal menjadi bilangan desimal. Angka 16 yang diberikan sebagai argumen kedua menunjukkan bahwa input dalam basis heksadesimal.

Hasil konversi bilangan heksadesimal ke bilangan desimal disimpan dalam variabel bilanganDesimal, dan kemudian dicetak menggunakan System.out.println.

Selanjutnya, kita menggunakan metode Integer.toBinaryString(bilanganDesimal) untuk mengkonversi bilangan desimal menjadi bilangan biner. Hasilnya disimpan dalam variabel bilanganBiner dan dicetak.

Terakhir, kita menggunakan metode Integer.toOctalString(bilanganDesimal) untuk mengkonversi bilangan desimal menjadi bilangan oktal. Hasilnya disimpan dalam variabel bilanganOktal dan dicetak.
*/
